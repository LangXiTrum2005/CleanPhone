package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
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
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.ba.AnonymousClass3;
import com.ironsource.adqualitysdk.sdk.i.ba.AnonymousClass5;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class av {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f425 = 1;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static char[] f426 = {22, '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '&', 'A', 131, 'l', 'm', 131, 129, 129, 131, '|', 'S', 'Z', 129, 130, '|', 'u', 'z', 127, 127, 'z', 'R', 'T', '{', '|', 'w', 'u', 's', 'Q', 'Z', 129, '\"', 'D', 'H', 'G', 'A', 'G', 'I', '9', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'i', 'A'};

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f427 = 0;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static long f428 = 8023077989044355884L;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private ISAdQualityInitListener f429;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private jh f430;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private bb f431;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private String f432;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private volatile ba f435;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final AtomicBoolean f441 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f442 = false;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private volatile List<cp> f439 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<gt> f438 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, JSONObject> f440 = new HashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Map<String, String> f436 = new HashMap();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private dc f434 = new dc();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private ee f433 = ee.m2145();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map<String, au> f437 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.av$17, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass17 extends je {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private /* synthetic */ String f477;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private /* synthetic */ List f478;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        final /* synthetic */ Context f480;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ Runnable f481;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f482;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        final /* synthetic */ Map f483;

        public AnonymousClass17(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f482 = str;
            this.f480 = context;
            this.f477 = str2;
            this.f478 = list;
            this.f483 = map;
            this.f481 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* JADX INFO: renamed from: ｋ */
        public final void mo254() {
            if (ar.m468().mo496(this.f482, av.m593(av.this))) {
                av.m604(av.this, this.f480, this.f477, this.f482, this.f478, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.17.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        if (av.m586(av.this)) {
                            p.m2991(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.17.3.1
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* JADX INFO: renamed from: ｋ */
                                public final void mo254() {
                                    AnonymousClass17 anonymousClass17 = AnonymousClass17.this;
                                    av.m638(av.this, anonymousClass17.f480, anonymousClass17.f483, anonymousClass17.f481);
                                }
                            }, ar.m468().mo475());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObject = new JSONObject();
            av.m639(av.this, this.f482, jSONObject);
            av.m587(av.this).put(this.f482, jSONObject);
            p.m2991(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.17.1
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    AnonymousClass17 anonymousClass17 = AnonymousClass17.this;
                    av.m638(av.this, anonymousClass17.f480, anonymousClass17.f483, anonymousClass17.f481);
                }
            }, ar.m468().mo475());
        }
    }

    public av(jh jhVar, ai aiVar, String str, ba baVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f430 = jhVar;
        bb bbVar = new bb(p.m2995(), aiVar);
        this.f431 = bbVar;
        kl.m2896(bbVar);
        this.f431.m723(new iv() { // from class: com.ironsource.adqualitysdk.sdk.i.av.3

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f503 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f504 = 93;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f505 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m656(int i10, boolean z10, int i11, String str2, int i12) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (d.f1625) {
                    try {
                        char[] cArr2 = new char[i10];
                        d.f1622 = 0;
                        while (true) {
                            int i13 = d.f1622;
                            if (i13 >= i10) {
                                break;
                            }
                            d.f1624 = cArr[i13];
                            cArr2[d.f1622] = (char) (d.f1624 + i11);
                            int i14 = d.f1622;
                            cArr2[i14] = (char) (cArr2[i14] - f504);
                            d.f1622 = i14 + 1;
                        }
                        if (i12 > 0) {
                            d.f1623 = i12;
                            char[] cArr3 = new char[i10];
                            System.arraycopy(cArr2, 0, cArr3, 0, i10);
                            int i15 = d.f1623;
                            System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                            int i16 = d.f1623;
                            System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i10];
                            d.f1622 = 0;
                            while (true) {
                                int i17 = d.f1622;
                                if (i17 >= i10) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i10 - i17) - 1];
                                d.f1622 = i17 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str3 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.iv
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final JSONObject mo657(String str2, JSONObject jSONObject) {
                int i10 = f505 + 77;
                f503 = i10 % 128;
                if (i10 % 2 == 0 ? str2.equals(m656((ViewConfiguration.getDoubleTapTimeout() >> 16) + 8, false, 201 - TextUtils.lastIndexOf("", '0'), "\u0005\u0002\u0005\u0007\u0003\ufff2\ufff8\u0005", 2 - TextUtils.lastIndexOf("", '0', 0, 0)).intern()) : str2.equals(m656(101 - (ViewConfiguration.getDoubleTapTimeout() - 73), true, 4960 << TextUtils.lastIndexOf("", 'x'), "\u0005\u0002\u0005\u0007\u0003\ufff2\ufff8\u0005", 5 % TextUtils.lastIndexOf("", 'r', 1, 1)).intern())) {
                    return av.this.m644();
                }
                int i11 = f503 + 13;
                f505 = i11 % 128;
                if (i11 % 2 != 0) {
                    return null;
                }
                throw null;
            }
        });
        this.f432 = str;
        this.f435 = baVar;
        this.f429 = iSAdQualityInitListener;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002a A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:3:0x0001, B:5:0x000e, B:16:0x002a, B:18:0x0030, B:11:0x001d, B:14:0x0020, B:7:0x0018, B:24:0x0040), top: B:31:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:3:0x0001, B:5:0x000e, B:16:0x002a, B:18:0x0030, B:11:0x001d, B:14:0x0020, B:7:0x0018, B:24:0x0040), top: B:31:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003c, please report this as an issue */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m579() {
        int i10;
        try {
            int i11 = f427 + 97;
            f425 = i11 % 128;
            if (i11 % 2 != 0) {
                if (ar.m468().mo472()) {
                    if (m583()) {
                        i10 = f425 + 117;
                        f427 = i10 % 128;
                        if (i10 % 2 == 0) {
                            return true;
                        }
                        throw null;
                    }
                }
                return false;
            }
            int i12 = 48 / 0;
            if (ar.m468().mo472()) {
                if (m583()) {
                    i10 = f425 + 117;
                    f427 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized void m580() {
        f427 = (f425 + 121) % 128;
        ba baVar = this.f435;
        if (baVar == null) {
            f425 = (f427 + 89) % 128;
        } else if (baVar.m710(m579())) {
            m648().adQualitySdkInitSuccess();
        } else {
            m648().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m618("荢湜夲䐒㜿⋙\u0df8\uf890\uebb7핏쁵댋鸫覟瓩枘劮㱆⼢ᨍԯ\uf0c6\ue3e2캀릠ꬋ陹脜氫忌䫫㖞₿Ꮅ﵇\ue87d\udb1c옮", TextUtils.getOffsetBefore("", 0) + 60703).intern());
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized Map<String, String> m581() {
        Map<String, String> map;
        int i10 = f427;
        map = this.f436;
        int i11 = i10 + 75;
        f425 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ List m582(av avVar) {
        int i10 = f427 + 67;
        f425 = i10 % 128;
        if (i10 % 2 != 0) {
            return avVar.m589();
        }
        avVar.m589();
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private List<cp> m584() {
        f425 = (f427 + 63) % 128;
        if (this.f439 != null) {
            ArrayList arrayList = new ArrayList(this.f439);
            int i10 = f427 + 11;
            f425 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 2 / 0;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i12 = f427 + InterfaceC0435l1.d.b.f29110g;
        f425 = i12 % 128;
        if (i12 % 2 != 0) {
            return arrayList2;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m586(av avVar) {
        int i10 = f427 + 75;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM583 = avVar.m583();
        if (i11 == 0) {
            int i12 = 52 / 0;
        }
        int i13 = f427 + 81;
        f425 = i13 % 128;
        if (i13 % 2 != 0) {
            return zM583;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ Map m587(av avVar) {
        f427 = (f425 + 81) % 128;
        Map<String, JSONObject> mapM585 = avVar.m585();
        int i10 = f427 + InterfaceC0435l1.d.b.f29109f;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 60 / 0;
        }
        return mapM585;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m590(av avVar) {
        f427 = (f425 + 81) % 128;
        avVar.m591();
        int i10 = f427 + 97;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ void m592(av avVar) {
        int i10 = f427 + 21;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        avVar.m580();
        if (i11 == 0) {
            int i12 = 83 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ String m593(av avVar) {
        int i10 = f427 + 99;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        String str = avVar.f432;
        if (i11 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Map m597(av avVar) {
        f427 = (f425 + 119) % 128;
        Map<String, String> mapM581 = avVar.m581();
        int i10 = f427 + 65;
        f425 = i10 % 128;
        if (i10 % 2 != 0) {
            return mapM581;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m609(av avVar) {
        int i10 = f427 + 87;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
            avVar.m594();
            throw null;
        }
        List<cp> listM594 = avVar.m594();
        int i11 = f427 + 71;
        f425 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 5 / 0;
        }
        return listM594;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ ba m617(av avVar) {
        int i10 = f425 + 83;
        f427 = i10 % 128;
        int i11 = i10 % 2;
        ba baVar = avVar.f435;
        if (i11 != 0) {
            throw null;
        }
        f427 = (f425 + 49) % 128;
        return baVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ cp m628(av avVar, Context context, String str, be beVar) {
        f427 = (f425 + 67) % 128;
        cp cpVarM595 = avVar.m595(context, str, beVar);
        int i10 = f425 + 35;
        f427 = i10 % 128;
        if (i10 % 2 == 0) {
            return cpVarM595;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ AtomicBoolean m634(av avVar) {
        int i10 = f427;
        int i11 = i10 + 83;
        f425 = i11 % 128;
        int i12 = i11 % 2;
        AtomicBoolean atomicBoolean = avVar.f441;
        if (i12 == 0) {
            int i13 = 22 / 0;
        }
        int i14 = i10 + 63;
        f425 = i14 % 128;
        if (i14 % 2 != 0) {
            return atomicBoolean;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m583() {
        boolean zMo473;
        try {
            int i10 = f427 + 73;
            f425 = i10 % 128;
            if (i10 % 2 == 0) {
                zMo473 = ar.m468().mo473();
                int i11 = 68 / 0;
            } else {
                zMo473 = ar.m468().mo473();
            }
            int i12 = f427 + 3;
            f425 = i12 % 128;
            if (i12 % 2 != 0) {
                return zMo473;
            }
            int i13 = 97 / 0;
            return zMo473;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m585() {
        Map<String, JSONObject> map;
        int i10 = (f425 + 37) % 128;
        f427 = i10;
        map = this.f440;
        int i11 = i10 + 5;
        f425 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean m588() {
        int i10 = f427 + 87;
        f425 = i10 % 128;
        if (i10 % 2 != 0) {
            return ar.m468().mo471();
        }
        ar.m468().mo471();
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized List<gt> m589() {
        List<gt> list;
        int i10 = (f427 + 7) % 128;
        f425 = i10;
        list = this.f438;
        int i11 = i10 + 75;
        f427 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m591() {
        ArrayList<cp> arrayList = new ArrayList();
        f427 = (f425 + InterfaceC0435l1.d.b.f29107d) % 128;
        for (cp cpVar : m584()) {
            if (m627(cpVar.m1737())) {
                int i10 = f427 + 3;
                f425 = i10 % 128;
                if (i10 % 2 == 0) {
                    arrayList.add(cpVar);
                    int i11 = 36 / 0;
                } else {
                    arrayList.add(cpVar);
                }
            }
        }
        for (final cp cpVar2 : arrayList) {
            String strIntern = m618("药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇", 3672 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m618("荨폲∱煨솒დ朏뙃۳啣", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20663).intern());
            sb2.append(cpVar2.m1739());
            sb2.append(m596("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{51, 10, 0, 0}, true).intern());
            m.m2985(strIntern, sb2.toString());
            String strM1737 = cpVar2.m1737();
            m605(strM1737, m585().get(strM1737));
            p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.6
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    cpVar2.m1741();
                }
            });
            m594().remove(cpVar2);
        }
        f427 = (f425 + 35) % 128;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private synchronized List<cp> m594() {
        List<cp> list;
        f425 = (f427 + InterfaceC0435l1.d.b.f29107d) % 128;
        list = this.f439;
        f425 = (f427 + 107) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m603(av avVar, Context context) {
        int i10 = f425 + 21;
        f427 = i10 % 128;
        int i11 = i10 % 2;
        avVar.m600(context);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m610(av avVar, List list) {
        f427 = (f425 + 99) % 128;
        avVar.f439 = list;
        f427 = (f425 + 83) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m622(av avVar, Context context, List list, List list2, je jeVar) {
        f425 = (f427 + 45) % 128;
        avVar.m632(context, (List<gt>) list, (List<String>) list2, jeVar);
        f425 = (f427 + 47) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ee m629(av avVar, ee eeVar) {
        int i10 = f427 + 73;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        avVar.f433 = eeVar;
        if (i11 != 0) {
            return eeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m636(av avVar, Context context, String str, String str2, gt gtVar, cp cpVar, boolean z10, be beVar, je jeVar) {
        f425 = (f427 + 121) % 128;
        avVar.m612(context, str, str2, gtVar, cpVar, z10, beVar, jeVar);
        int i10 = f425 + 29;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 98 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m604(av avVar, Context context, String str, String str2, List list, je jeVar) {
        int i10 = f425 + 57;
        f427 = i10 % 128;
        int i11 = i10 % 2;
        avVar.m601(context, str, str2, list, jeVar);
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m611(av avVar, Map map) {
        int i10 = (f425 + 1) % 128;
        f427 = i10;
        avVar.f437 = map;
        int i11 = i10 + InterfaceC0435l1.d.b.f29114k;
        f425 = i11 % 128;
        if (i11 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m623(av avVar, cp cpVar, String str) {
        int i10 = f427 + 13;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        avVar.m633(cpVar, str);
        if (i11 == 0) {
            int i12 = 25 / 0;
        }
        f427 = (f425 + 125) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ List m630(av avVar) {
        int i10 = f427 + 53;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        List<cp> listM584 = avVar.m584();
        if (i11 == 0) {
            int i12 = 27 / 0;
        }
        int i13 = f427 + 7;
        f425 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 87 / 0;
        }
        return listM584;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m637(av avVar, Context context, String str, String str2, List list, je jeVar) {
        int i10 = f425 + 29;
        f427 = i10 % 128;
        int i11 = i10 % 2;
        avVar.m614(context, str, str2, (List<gt>) list, jeVar);
        if (i11 != 0) {
            int i12 = 23 / 0;
        }
        int i13 = f427 + 61;
        f425 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m606(cp cpVar) {
        f425 = (f427 + 121) % 128;
        boolean zM641 = m641(cpVar);
        f425 = (f427 + 49) % 128;
        return zM641;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m615(av avVar, Context context, String str, String str2, gt gtVar, je jeVar) {
        f427 = (f425 + 25) % 128;
        avVar.m613(context, str, str2, gtVar, jeVar);
        f425 = (f427 + 65) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m624() {
        f425 = (f427 + InterfaceC0435l1.d.b.f29105b) % 128;
        boolean zM588 = m588();
        f427 = (f425 + 121) % 128;
        return zM588;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m631(av avVar, cp cpVar) {
        JSONObject jSONObjectM619;
        int i10 = f427 + 9;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM619 = m619(cpVar);
            int i11 = 1 / 0;
        } else {
            jSONObjectM619 = m619(cpVar);
        }
        f427 = (f425 + 1) % 128;
        return jSONObjectM619;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m638(av avVar, Context context, Map map, Runnable runnable) {
        int i10 = f425 + 81;
        f427 = i10 % 128;
        int i11 = i10 % 2;
        avVar.m602(context, (Map<String, List<gt>>) map, runnable);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f427 + 87;
        f425 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m616(cp cpVar, String str) {
        f427 = (f425 + 67) % 128;
        boolean zM626 = m626(cpVar, str);
        f427 = (f425 + 97) % 128;
        return zM626;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m625(av avVar, String str) {
        f425 = (f427 + 93) % 128;
        boolean zM627 = avVar.m627(str);
        int i10 = f425 + 123;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 47 / 0;
        }
        return zM627;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m639(av avVar, String str, JSONObject jSONObject) {
        int i10 = f427 + 7;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        avVar.m605(str, jSONObject);
        if (i11 == 0) {
            int i12 = 87 / 0;
        }
        f427 = (f425 + 27) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m643(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f427 + 23;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        this.f431.m730(iSAdQualityAdListener);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f427 + 51;
        f425 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 18 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m647(final Context context, final Runnable runnable) {
        f425 = (f427 + InterfaceC0435l1.d.b.f29114k) % 128;
        if (this.f441.get()) {
            f427 = (f425 + 39) % 128;
            return;
        }
        if (this.f442) {
            p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.8
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    runnable.run();
                }
            });
            f427 = (f425 + InterfaceC0435l1.d.b.f29114k) % 128;
            return;
        }
        String strIntern = m618("荭棹吟䁊ⶉᤵգ\uf28f\udedd쩆랂ꏼ", Drawable.resolveOpacity(0, 0) + 60337).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m618("茁匲⍧\uf398쏍鏾戳㉤ʙ틊ꋿ焰䅥ᆖ\ue1c6놸聮倠⃔\uf0b6삿靶朼㟚ށퟷꙃ瘩䛩\u169e\ue6b7땭蔥嗋▓\uf5f5", TextUtils.getCapsMode("", 0, 0) + 53299).intern());
        sb2.append(IronSourceAdQuality.getSDKVersion());
        sb2.append(m596("\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001", new int[]{0, 15, 0, 0}, true).intern());
        m.m2985(strIntern, sb2.toString());
        je jeVar = new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.10
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.10.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        runnable.run();
                    }
                });
                av.m603(av.this, context);
            }
        };
        if (m579()) {
            m635(context, jeVar);
        } else {
            m621(context, jeVar);
        }
        this.f442 = true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m621(Context context, je jeVar) {
        int i10 = f425 + 91;
        f427 = i10 % 128;
        if (i10 % 2 == 0) {
            m620(context, ay.m680(), ay.m684(), jeVar);
        } else {
            m620(context, ay.m680(), ay.m684(), jeVar);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m635(Context context, je jeVar) {
        m632(context, new ArrayList(ay.m682()), new ArrayList(ay.m679()), jeVar);
        f427 = (f425 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m642() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            for (String str : new HashSet(m581().keySet())) {
                f427 = (f425 + 115) % 128;
                jSONObject2.put(str, m581().get(str));
                f425 = (f427 + 91) % 128;
            }
            jSONObject.put(m618("草\ud817㗌銄", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 23369).intern(), jSONObject2);
            return jSONObject;
        } catch (JSONException e10) {
            m.m2983(m618("药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇", View.MeasureSpec.getSize(0) + 3671).intern(), m596("\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{15, 29, 17, 3}, true).intern(), e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m644() {
        int i10 = f425 + 117;
        f427 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                JSONObject jSONObjectM599 = m599(m585());
                int i11 = f425 + 85;
                f427 = i11 % 128;
                if (i11 % 2 == 0) {
                    return jSONObjectM599;
                }
                throw null;
            }
            m599(m585());
            throw null;
        } catch (JSONException e10) {
            m.m2983(m618("药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇", Color.red(0) + 3671).intern(), m618("荩멟\uf15c⡀杚鸉핋\u0c4f䭀艌륈\uf040⼀時鵍푍ፒ䩘腝롋\uf757⹋攚鱍\udb51ቇ䥅聞뽟\uf65fⵁ", View.MeasureSpec.makeMeasureSpec(0, 0) + 14593).intern(), e10);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m641(cp cpVar) {
        int i10 = f427 + InterfaceC0435l1.d.b.f29105b;
        f425 = i10 % 128;
        if (i10 % 2 != 0) {
            String strM1731 = cpVar.m1731();
            if (strM1731 != null && kn.m2912(IronSourceAdQuality.getSDKVersion(), strM1731) < 0) {
                return false;
            }
            int i11 = f427 + 67;
            f425 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 21 / 0;
            }
            return true;
        }
        cpVar.m1731();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m608(List<gt> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        f427 = (f425 + 115) % 128;
        if (list.get(0) == null) {
            return null;
        }
        String strMo2240 = list.get(0).mo2240();
        int i10 = f427 + 117;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 9 / 0;
        }
        return strMo2240;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m620(final Context context, final gt gtVar, final String str, final je jeVar) {
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.14
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (av.m634(av.this).get()) {
                    return;
                }
                final String lowerCase = str.toLowerCase();
                ba baVarM617 = av.m617(av.this);
                if (baVarM617 == null) {
                    return;
                }
                baVarM617.m708(lowerCase);
                p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.14.3

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f465 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f466 = 0;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f467 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', 'I', 'i', 'l', 'z', ' ', 'E'};

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static char f468 = 4;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m651(int i10, String str2, byte b10) {
                        String str3;
                        Object charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (j.f2647) {
                            try {
                                char[] cArr2 = f467;
                                char c4 = f468;
                                char[] cArr3 = new char[i10];
                                if (i10 % 2 != 0) {
                                    i10--;
                                    cArr3[i10] = (char) (cArr[i10] - b10);
                                }
                                if (i10 > 1) {
                                    j.f2654 = 0;
                                    while (true) {
                                        int i11 = j.f2654;
                                        if (i11 >= i10) {
                                            break;
                                        }
                                        j.f2653 = cArr[i11];
                                        j.f2650 = cArr[j.f2654 + 1];
                                        if (j.f2653 == j.f2650) {
                                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                                        } else {
                                            j.f2652 = j.f2653 / c4;
                                            j.f2649 = j.f2653 % c4;
                                            j.f2651 = j.f2650 / c4;
                                            j.f2648 = j.f2650 % c4;
                                            if (j.f2649 == j.f2648) {
                                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                                int i12 = (j.f2652 * c4) + j.f2649;
                                                int i13 = (j.f2651 * c4) + j.f2648;
                                                int i14 = j.f2654;
                                                cArr3[i14] = cArr2[i12];
                                                cArr3[i14 + 1] = cArr2[i13];
                                            } else if (j.f2652 == j.f2651) {
                                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                                int i15 = (j.f2652 * c4) + j.f2649;
                                                int i16 = (j.f2651 * c4) + j.f2648;
                                                int i17 = j.f2654;
                                                cArr3[i17] = cArr2[i15];
                                                cArr3[i17 + 1] = cArr2[i16];
                                            } else {
                                                int i18 = (j.f2652 * c4) + j.f2648;
                                                int i19 = (j.f2651 * c4) + j.f2649;
                                                int i20 = j.f2654;
                                                cArr3[i20] = cArr2[i18];
                                                cArr3[i20 + 1] = cArr2[i19];
                                            }
                                        }
                                        j.f2654 += 2;
                                    }
                                }
                                str3 = new String(cArr3);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str3;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        int i10 = f465 + 71;
                        f466 = i10 % 128;
                        if (i10 % 2 != 0) {
                            av.m634(av.this).get();
                            throw null;
                        }
                        if (av.m634(av.this).get()) {
                            return;
                        }
                        String strIntern = m651((ViewConfiguration.getPressedStateDuration() >> 16) + 16, "\u0001\u0002ää\u0000\u0007\t\u0005\u0007\u0004\n\u0000\t\n\u0002\u0007", (byte) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 117)).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m651(23 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u000e\u0006\t\u0007\b\t\u000f\b\u000f\t\u0001\n\f\u0006\u0002\u0003\u0003\u0000\u0005\u0006\u0002\u0005\u0090", (byte) (112 - Color.argb(0, 0, 0, 0))).intern());
                        sb2.append(lowerCase);
                        m.m2963(strIntern, sb2.toString());
                        try {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            av.m615(av.this, context, str, lowerCase, gtVar, jeVar);
                        } catch (Throwable th2) {
                            ba baVarM618 = av.m617(av.this);
                            if (baVarM618 != null) {
                                p.m2998(baVarM618.new AnonymousClass3(lowerCase, az.b.f605));
                            }
                            av.m597(av.this).put(str, kl.m2895(th2).toString());
                            String strIntern2 = m651(16 - View.getDefaultSize(0, 0), "\u0001\u0002ää\u0000\u0007\t\u0005\u0007\u0004\n\u0000\t\n\u0002\u0007", (byte) (AndroidCharacter.getMirror('0') + 'F')).intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m651(TextUtils.indexOf((CharSequence) "", '0') + 26, "\u000e\u0007\u0005\u0002\n\u0002\u0005\u0007\u0000\u000b\u0007\t\u0001\n\f\u0006\u0002\u0003\u0003\u0000\u0005\u0006\u0002\u0005r", (byte) (81 - ExpandableListView.getPackedPositionChild(0L))).intern());
                            sb3.append(lowerCase);
                            kl.m2893(strIntern2, sb3.toString(), th2, true, true, true);
                            int i11 = f466 + 89;
                            f465 = i11 % 128;
                            if (i11 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                });
            }
        });
        int i10 = f425 + 3;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 77 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static JSONObject m619(cp cpVar) {
        f427 = (f425 + 27) % 128;
        JSONObject jSONObjectM598 = m598(cpVar.m1735());
        try {
            jSONObjectM598.put(is.f2566, cpVar.m1738());
        } catch (JSONException e10) {
            m.m2983(m618("药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇", 3671 - Color.argb(0, 0, 0, 0)).intern(), m618("荩〩\ue5b0餦亂ɟ랅欟ᣱ챢臾㕘\uead6鹀厎¶됳榥ᴜ튜蘃㮛\uef79鳯値ׅ륟滓≛휾蒱㠫\uedecꄑ嚑ਆ뿾", View.getDefaultSize(0, 0) + 45943).intern(), e10);
        }
        int i10 = f425 + 61;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
        return jSONObjectM598;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m640(String str, be beVar) {
        if (beVar != null) {
            f427 = (f425 + 71) % 128;
            m585().put(str, m598(beVar.m819()));
            f425 = (f427 + 119) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m600(final Context context) {
        f425 = (f427 + 9) % 128;
        if (!m583()) {
            p.m2997(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.11
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.11.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            av.m592(av.this);
                        }
                    });
                }
            }, ar.m468().mo478());
            f427 = (f425 + 107) % 128;
        }
        final Map<String, List<gt>> mapM683 = ay.m683();
        p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.12
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                av.m611(av.this, ar.m468().mo497());
                av.m638(av.this, context, mapM683, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.12.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        if (av.m586(av.this)) {
                            av.m592(av.this);
                        }
                    }
                });
                ar.m468().mo498(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.av.12.3

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static int f454 = 0;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f455 = {'!', 'Y', 'n', 'n', 'i', 'd', 'k', 'q', 'p', '_', 'W', 'g', 'g', 'd', 'f', 'k', '2', 'o', 'q', 'j', 'f', 'e', 'n', 'n', 'k', 'k', 'D', 'C', 'j', 'k', 'j', 'g', 'a', 'j', 'n', 'V', '[', 'r', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'i', 'A', 'B'};

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f456 = 1;

                    @Override // com.ironsource.adqualitysdk.sdk.i.ax
                    /* JADX INFO: renamed from: ﾇ */
                    public final void mo304() {
                        f456 = (f454 + 35) % 128;
                        av.m611(av.this, ar.m468().mo497());
                        m.m2963(m650("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 16, 0, 0}, false).intern(), m650("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{16, 32, 0, 20}, true).intern());
                        av.m590(av.this);
                        f456 = (f454 + 49) % 128;
                    }

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m650(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                                System.arraycopy(f455, i10, cArr, 0, i11);
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
                });
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2.f441.getAndSet(true) != false) goto L12;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m646() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = com.ironsource.adqualitysdk.sdk.i.av.f427     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.av.f425 = r1     // Catch: java.lang.Throwable -> L17
            int r0 = r0 % 2
            if (r0 != 0) goto L19
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f441     // Catch: java.lang.Throwable -> L17
            r1 = 0
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L24
            goto L22
        L17:
            r0 = move-exception
            goto L4d
        L19:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f441     // Catch: java.lang.Throwable -> L17
            r1 = 1
            boolean r0 = r0.getAndSet(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L24
        L22:
            monitor-exit(r2)
            return
        L24:
            com.ironsource.adqualitysdk.sdk.i.ba r0 = r2.f435     // Catch: java.lang.Throwable -> L17
            com.ironsource.adqualitysdk.sdk.i.av$13 r1 = new com.ironsource.adqualitysdk.sdk.i.av$13     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            com.ironsource.adqualitysdk.sdk.i.p.m2996(r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L40
            com.ironsource.adqualitysdk.sdk.i.ba$1 r1 = new com.ironsource.adqualitysdk.sdk.i.ba$1     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            com.ironsource.adqualitysdk.sdk.i.p.m2998(r1)     // Catch: java.lang.Throwable -> L17
            int r0 = com.ironsource.adqualitysdk.sdk.i.av.f425     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 115
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.av.f427 = r0     // Catch: java.lang.Throwable -> L17
        L40:
            r0 = 0
            r2.f435 = r0     // Catch: java.lang.Throwable -> L17
            int r0 = com.ironsource.adqualitysdk.sdk.i.av.f427     // Catch: java.lang.Throwable -> L17
            int r0 = r0 + 105
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.av.f425 = r0     // Catch: java.lang.Throwable -> L17
            monitor-exit(r2)
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.av.m646():void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m614(Context context, String str, String str2, List<gt> list, je jeVar) {
        Iterator<gt> it;
        int i10 = f427 + 63;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
            it = list.iterator();
            int i11 = 1 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            int i12 = f427 + 21;
            f425 = i12 % 128;
            if (i12 % 2 != 0) {
                m613(context, str, str2, it.next(), jeVar);
            } else {
                m613(context, str, str2, it.next(), jeVar);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m649(String str) {
        m645(str, new ArrayList());
        f427 = (f425 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m648() {
        int i10 = f425;
        ISAdQualityInitListener iSAdQualityInitListener = this.f429;
        int i11 = i10 + 79;
        f427 = i11 % 128;
        if (i11 % 2 == 0) {
            return iSAdQualityInitListener;
        }
        int i12 = 19 / 0;
        return iSAdQualityInitListener;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.kn.m2912(r5, r4.m1732()) <= 0) goto L18;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m626(com.ironsource.adqualitysdk.sdk.i.cp r4, java.lang.String r5) {
        /*
            r0 = 44
            r1 = 7
            r2 = 0
            int[] r0 = new int[]{r0, r1, r2, r2}
            java.lang.String r1 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0001"
            r3 = 1
            java.lang.String r0 = m596(r1, r0, r3)
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L57
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L4e
            int r0 = com.ironsource.adqualitysdk.sdk.i.av.f427
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.av.f425 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L39
            java.lang.String r0 = r4.m1733()
            int r0 = com.ironsource.adqualitysdk.sdk.i.kn.m2912(r5, r0)
            r1 = 73
            int r1 = r1 / r2
            if (r0 < 0) goto L4e
            goto L43
        L39:
            java.lang.String r0 = r4.m1733()
            int r0 = com.ironsource.adqualitysdk.sdk.i.kn.m2912(r5, r0)
            if (r0 < 0) goto L4e
        L43:
            java.lang.String r4 = r4.m1732()
            int r4 = com.ironsource.adqualitysdk.sdk.i.kn.m2912(r5, r4)
            if (r4 > 0) goto L4e
            goto L57
        L4e:
            int r4 = com.ironsource.adqualitysdk.sdk.i.av.f427
            int r4 = r4 + 51
            int r4 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.av.f425 = r4
            return r2
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.av.m626(com.ironsource.adqualitysdk.sdk.i.cp, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m613(final Context context, final String str, final String str2, final gt gtVar, final je jeVar) {
        jl.e eVarM2261 = gtVar.m2261();
        if (eVarM2261 != null) {
            f427 = (f425 + 53) % 128;
            final be beVarMo2241 = gtVar.mo2241();
            m640(str2, beVarMo2241);
            ba baVar = this.f435;
            if (baVar != null) {
                p.m2998(baVar.new AnonymousClass5(str2, az.a.f596));
                f425 = (f427 + 31) % 128;
            }
            final String strM2618 = this.f430.m2618(eVarM2261, new iz() { // from class: com.ironsource.adqualitysdk.sdk.i.av.4
                @Override // com.ironsource.adqualitysdk.sdk.i.iz
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo658(String str3) {
                    av.m636(av.this, context, str, str2, gtVar, av.m628(av.this, context, str3, beVarMo2241), false, beVarMo2241, jeVar);
                }
            });
            p.m2997(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.9
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    cp cpVarM628 = av.m628(av.this, context, strM2618, beVarMo2241);
                    if (cpVarM628 != null) {
                        av.m636(av.this, context, str, str2, gtVar, cpVarM628, true, beVarMo2241, jeVar);
                    } else {
                        p.m2996(jeVar);
                    }
                }
            }, m607(eVarM2261));
            return;
        }
        p.m2996(jeVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m602(Context context, Map<String, List<gt>> map, final Runnable runnable) {
        int i10;
        while (map != null && map.size() > 0) {
            String next = map.keySet().iterator().next();
            List<gt> listRemove = map.remove(next);
            String strM608 = m608(listRemove);
            if (strM608 != null) {
                ba baVar = this.f435;
                if (baVar != null) {
                    baVar.m708(strM608);
                }
                p.m2994(new AnonymousClass17(strM608, context, next, listRemove, map, runnable));
                if (m583()) {
                    return;
                }
                m602(context, map, runnable);
                i10 = f427 + 69;
                f425 = i10 % 128;
            }
        }
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.1
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                p.m2994(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        runnable.run();
                    }
                });
            }
        });
        i10 = f427 + InterfaceC0435l1.d.b.f29105b;
        f425 = i10 % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m627(String str) {
        int i10 = f425 + InterfaceC0435l1.d.b.f29110g;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f437.containsKey(str);
            throw null;
        }
        if (this.f437.containsKey(str)) {
            int i11 = f427 + InterfaceC0435l1.d.b.f29105b;
            f425 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f437.get(str).m576(this.f432);
                throw null;
            }
            if (this.f437.get(str).m576(this.f432)) {
                return true;
            }
        }
        int i12 = f427 + 53;
        f425 = i12 % 128;
        if (i12 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m632(Context context, final List<gt> list, final List<String> list2, final je jeVar) {
        av avVar;
        final Context context2;
        int i10 = f425 + 61;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
            if (list.isEmpty()) {
                return;
            }
        } else if (list.isEmpty()) {
            return;
        }
        gt gtVarRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (list.isEmpty()) {
            int i12 = f425 + 123;
            f427 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            avVar = this;
            context2 = context;
        } else {
            avVar = this;
            context2 = context;
            jeVar = new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.15
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    p.m2997(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.15.2
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            AnonymousClass15 anonymousClass15 = AnonymousClass15.this;
                            av.m622(av.this, context2, list, list2, jeVar);
                        }
                    }, ar.m468().mo475());
                }
            };
        }
        avVar.m620(context2, gtVarRemove, strRemove, jeVar);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m618(String str, int i10) {
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
                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f428);
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m633(final cp cpVar, final String str) {
        int i10 = f425 + 85;
        f427 = i10 % 128;
        if (i10 % 2 == 0) {
            if (this.f441.get()) {
                return;
            }
            final String strM1737 = cpVar.m1737();
            ba baVar = this.f435;
            if (baVar == null) {
                int i11 = f425 + 95;
                f427 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            }
            p.m2998(baVar.new AnonymousClass5(strM1737, az.a.f592));
            p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.2

                /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
                private static int f487 = 1;

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static char f488 = 51874;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static char f489 = 43440;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static char f490 = 7173;

                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                private static char f491 = 57730;

                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                private static int f492 = 0;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static long f493 = -4325221177743454277L;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static String m652(String str2, int i12) {
                    String str3;
                    Object charArray = str2;
                    if (str2 != null) {
                        charArray = str2.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (o.f3076) {
                        try {
                            char[] cArr2 = new char[cArr.length];
                            o.f3077 = 0;
                            char[] cArr3 = new char[2];
                            while (true) {
                                int i13 = o.f3077;
                                if (i13 < cArr.length) {
                                    cArr3[0] = cArr[i13];
                                    cArr3[1] = cArr[i13 + 1];
                                    int i14 = 58224;
                                    for (int i15 = 0; i15 < 16; i15++) {
                                        char c4 = cArr3[1];
                                        char c5 = cArr3[0];
                                        char c10 = (char) (c4 - (((c5 + i14) ^ ((c5 << 4) + f489)) ^ ((c5 >>> 5) + f488)));
                                        cArr3[1] = c10;
                                        cArr3[0] = (char) (c5 - (((c10 >>> 5) + f491) ^ ((c10 + i14) ^ ((c10 << 4) + f490))));
                                        i14 -= 40503;
                                    }
                                    int i16 = o.f3077;
                                    cArr2[i16] = cArr3[0];
                                    cArr2[i16 + 1] = cArr3[1];
                                    o.f3077 = i16 + 2;
                                } else {
                                    str3 = new String(cArr2, 0, i12);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str3;
                }

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static String m653(String str2, int i12) {
                    String str3;
                    Object charArray = str2;
                    if (str2 != null) {
                        charArray = str2.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (i.f2435) {
                        try {
                            i.f2436 = i12;
                            char[] cArr2 = new char[cArr.length];
                            i.f2434 = 0;
                            while (true) {
                                int i13 = i.f2434;
                                if (i13 < cArr.length) {
                                    cArr2[i13] = (char) (((long) (cArr[i13] ^ (i.f2436 * i13))) ^ f493);
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

                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo654(Throwable th2) {
                    f487 = (f492 + 41) % 128;
                    ba baVarM617 = av.m617(av.this);
                    if (baVarM617 != null) {
                        p.m2998(baVarM617.new AnonymousClass3(strM1737, az.b.f601));
                    }
                    String strIntern = m652("矧퉋꛳瞮\ue077忪鈓繩푒三\ueed6쿛妼濫器\u07b9", 16 - TextUtils.getCapsMode("", 0, 0)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m653("쿾\ue260钛䜯祭⯖\ude24\uf04aꊚ唾݈㦙\uec3b鹇냿挵ᕅ쟥啕걓廠焈⍓헱蠀멎泾Ἒ\u31e7", 11689 - (Process.myTid() >> 22)).intern());
                    sb2.append(strM1737);
                    kl.m2893(strIntern, sb2.toString(), th2, true, true, true);
                    int i12 = f492 + 69;
                    f487 = i12 % 128;
                    if (i12 % 2 == 0) {
                        throw null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:23:0x012c  */
                /* JADX WARN: Code duplicated, block: B:25:0x0143  */
                /* JADX WARN: Code duplicated, block: B:28:0x01a5  */
                /* JADX WARN: Code duplicated, block: B:29:0x01f6  */
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() throws Exception {
                    JSONObject jSONObjectM631 = av.m631(av.this, cpVar);
                    jSONObjectM631.put(m653("쿞괼", KeyEvent.getDeadChar(0, 0) + 25343).intern(), true);
                    av.m587(av.this).put(cpVar.m1737(), jSONObjectM631);
                    String strM1735 = cpVar.m1735();
                    ba baVarM617 = av.m617(av.this);
                    if (m653("쿿ᶫ歚룱蚝푊⇨ྐ", 53848 - MotionEvent.axisFromString("")).intern().equals(strM1735)) {
                        String strIntern = m652("矧퉋꛳瞮\ue077忪鈓繩푒三\ueed6쿛妼濫器\u07b9", (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cpVar.m1739());
                        sb2.append(m652("嬧䙎\uf783陃\ueb7d㭛鉼\ue425枖\u1977컬\uf753प竑ﺊ腌ᒦ☱瞺燥㹦䭒", 22 - KeyEvent.keyCodeFromString("")).intern());
                        m.m2963(strIntern, sb2.toString());
                        if (baVarM617 != null) {
                            p.m2998(baVarM617.new AnonymousClass5(strM1737, az.a.f595));
                        }
                    } else if (av.m625(av.this, strM1737)) {
                        String strIntern2 = m652("矧퉋꛳瞮\ue077忪鈓繩푒三\ueed6쿛妼濫器\u07b9", Color.argb(0, 0, 0, 0) + 16).intern();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(cpVar.m1739());
                        sb3.append(m653("쾛纫괲\udb8cਙ룡\ue76aᗪ䑌\uf2c2⇥倽麾촟篑ꩢ\ud8e2ݫ뗌\ue450ጫ䆱\uf03d㻎洕鯲쩺磷꜏허ҩ댳\ue1fbရ庘走㯡橁飛", 45427 - Drawable.resolveOpacity(0, 0)).intern());
                        m.m2963(strIntern2, sb3.toString());
                        if (baVarM617 != null) {
                            p.m2998(baVarM617.new AnonymousClass5(strM1737, az.a.f595));
                        }
                        jSONObjectM631.put(m652("ࡘ\ue84c\udbe2论", 3 - Drawable.resolveOpacity(0, 0)).intern(), true);
                    } else if (av.m624()) {
                        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.2.1

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static int f498 = 1;

                            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                            private static int f499 = 0;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static char[] f500 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', ' ', 's', 'u', 'f', 'l', 'y', 'i', 'z', 'd', 'E', 'v', 'j', 'A', 'Q', 'S', 'D', 'K', 'w', 'h', 'I', '.', 'F', 'G', 'H', 'J', 'L'};

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static char f501 = 6;

                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ﻐ */
                            public final void mo654(Throwable th2) {
                                try {
                                    ((JSONObject) av.m587(av.this).get(cpVar.m1737())).put(m655(4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u000e\u0004\u0011\u0004", (byte) (KeyEvent.normalizeMetaState(0) + 81)).intern(), false);
                                    f498 = (f499 + 95) % 128;
                                } catch (JSONException e10) {
                                    m.m2983(m655(View.MeasureSpec.getMode(0) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (TextUtils.getTrimmedLength("") + 83)).intern(), m655((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, "\u0012\u0007\u0007\u0000\u0007\u000b\t\u0005\u0087\u0087\u000e\u0004\n\u000b\u000e\u0004\u0011\u0004\u000b\u0004\u0004\u0007\u0005\u0002\u0081\u0081\u0004\u0005\u0000\u0002\u0007\u000b\u0015\u0002\u0007\u0006\r\u0004\u0004\b\u0017\t\u0002\u0003", (byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19)).intern(), e10);
                                }
                                ba baVarM618 = av.m617(av.this);
                                if (baVarM618 != null) {
                                    p.m2998(baVarM618.new AnonymousClass3(strM1737, az.b.f606));
                                    f498 = (f499 + 5) % 128;
                                }
                                String strIntern3 = m655(16 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (Color.alpha(0) + 83)).intern();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(m655((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, "\u0012\u0007\u0007\u0000\u0007\u000b\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u0092", (byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 114)).intern());
                                sb4.append(cpVar.m1739());
                                kl.m2893(strIntern3, f2.m(sb4, m655(10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007", (byte) ((Process.myPid() >> 22) + 58))), th2, true, true, true);
                                String strIntern4 = m655(11 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0017\u0013\u0012\u0011\u000e\u0014\u0011\u0004\f\u001b\u001a\u001b", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 98)).intern();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(m655(53 - TextUtils.indexOf("", ""), "\u0014\u0004\t\u0004««\u0000\u0007\u0007\u0004\u009c\u009c\u0012\f\t\u0000\u0016\u0006\u001c\u001d\u0011\u000f\u0004\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u000b\u001c\u001c\u0012\u0013\u0012\u000e\u0006\u000f\u0011\u0003\u0011\u0006\u001c\u001a\u001bY", (byte) (57 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern());
                                sb5.append(cpVar.m1739());
                                sb5.append(m655((ViewConfiguration.getJumpTapTimeout() >> 16) + 11, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007{", (byte) (77 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
                                m.m2968(strIntern4, sb5.toString());
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                int i12 = f499 + 39;
                                f498 = i12 % 128;
                                if (i12 % 2 == 0) {
                                    cpVar.m1736();
                                    av.m617(av.this);
                                    throw null;
                                }
                                cpVar.m1736();
                                ba baVarM618 = av.m617(av.this);
                                if (baVarM618 != null) {
                                    p.m2998(baVarM618.new AnonymousClass5(strM1737, az.a.f594));
                                }
                                String strIntern3 = m655((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (83 - Gravity.getAbsoluteGravity(0, 0))).intern();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(cpVar.m1739());
                                sb4.append(m655((ViewConfiguration.getKeyRepeatDelay() >> 16) + 35, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007\u000b\u0006\u0010\u0000\u0005\u0004½½\u000e\r¶¶\u0010\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\u000f\u0005®", (byte) (Color.red(0) + 74)).intern());
                                m.m2963(strIntern3, sb4.toString());
                                f499 = (f498 + 59) % 128;
                            }

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static String m655(int i12, String str2, byte b10) {
                                String str3;
                                Object charArray = str2;
                                if (str2 != null) {
                                    charArray = str2.toCharArray();
                                }
                                char[] cArr = (char[]) charArray;
                                synchronized (j.f2647) {
                                    try {
                                        char[] cArr2 = f500;
                                        char c4 = f501;
                                        char[] cArr3 = new char[i12];
                                        if (i12 % 2 != 0) {
                                            i12--;
                                            cArr3[i12] = (char) (cArr[i12] - b10);
                                        }
                                        if (i12 > 1) {
                                            j.f2654 = 0;
                                            while (true) {
                                                int i13 = j.f2654;
                                                if (i13 >= i12) {
                                                    break;
                                                }
                                                j.f2653 = cArr[i13];
                                                j.f2650 = cArr[j.f2654 + 1];
                                                if (j.f2653 == j.f2650) {
                                                    cArr3[j.f2654] = (char) (j.f2653 - b10);
                                                    cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                                                } else {
                                                    j.f2652 = j.f2653 / c4;
                                                    j.f2649 = j.f2653 % c4;
                                                    j.f2651 = j.f2650 / c4;
                                                    j.f2648 = j.f2650 % c4;
                                                    if (j.f2649 == j.f2648) {
                                                        j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                                        j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                                        int i14 = (j.f2652 * c4) + j.f2649;
                                                        int i15 = (j.f2651 * c4) + j.f2648;
                                                        int i16 = j.f2654;
                                                        cArr3[i16] = cArr2[i14];
                                                        cArr3[i16 + 1] = cArr2[i15];
                                                    } else if (j.f2652 == j.f2651) {
                                                        j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                                        j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                                        int i17 = (j.f2652 * c4) + j.f2649;
                                                        int i18 = (j.f2651 * c4) + j.f2648;
                                                        int i19 = j.f2654;
                                                        cArr3[i19] = cArr2[i17];
                                                        cArr3[i19 + 1] = cArr2[i18];
                                                    } else {
                                                        int i20 = (j.f2652 * c4) + j.f2648;
                                                        int i21 = (j.f2651 * c4) + j.f2649;
                                                        int i22 = j.f2654;
                                                        cArr3[i22] = cArr2[i20];
                                                        cArr3[i22 + 1] = cArr2[i21];
                                                    }
                                                }
                                                j.f2654 += 2;
                                            }
                                        }
                                        str3 = new String(cArr3);
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                return str3;
                            }
                        });
                        av.m609(av.this).add(cpVar);
                    } else {
                        int i12 = f492 + 55;
                        f487 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 2 / 0;
                            if (av.m616(cpVar, strM1735)) {
                                p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.2.1

                                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                    private static int f498 = 1;

                                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                    private static int f499 = 0;

                                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                    private static char[] f500 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', ' ', 's', 'u', 'f', 'l', 'y', 'i', 'z', 'd', 'E', 'v', 'j', 'A', 'Q', 'S', 'D', 'K', 'w', 'h', 'I', '.', 'F', 'G', 'H', 'J', 'L'};

                                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                    private static char f501 = 6;

                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* JADX INFO: renamed from: ﻐ */
                                    public final void mo654(Throwable th2) {
                                        try {
                                            ((JSONObject) av.m587(av.this).get(cpVar.m1737())).put(m655(4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u000e\u0004\u0011\u0004", (byte) (KeyEvent.normalizeMetaState(0) + 81)).intern(), false);
                                            f498 = (f499 + 95) % 128;
                                        } catch (JSONException e10) {
                                            m.m2983(m655(View.MeasureSpec.getMode(0) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (TextUtils.getTrimmedLength("") + 83)).intern(), m655((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, "\u0012\u0007\u0007\u0000\u0007\u000b\t\u0005\u0087\u0087\u000e\u0004\n\u000b\u000e\u0004\u0011\u0004\u000b\u0004\u0004\u0007\u0005\u0002\u0081\u0081\u0004\u0005\u0000\u0002\u0007\u000b\u0015\u0002\u0007\u0006\r\u0004\u0004\b\u0017\t\u0002\u0003", (byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19)).intern(), e10);
                                        }
                                        ba baVarM618 = av.m617(av.this);
                                        if (baVarM618 != null) {
                                            p.m2998(baVarM618.new AnonymousClass3(strM1737, az.b.f606));
                                            f498 = (f499 + 5) % 128;
                                        }
                                        String strIntern3 = m655(16 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (Color.alpha(0) + 83)).intern();
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(m655((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, "\u0012\u0007\u0007\u0000\u0007\u000b\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u0092", (byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 114)).intern());
                                        sb4.append(cpVar.m1739());
                                        kl.m2893(strIntern3, f2.m(sb4, m655(10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007", (byte) ((Process.myPid() >> 22) + 58))), th2, true, true, true);
                                        String strIntern4 = m655(11 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0017\u0013\u0012\u0011\u000e\u0014\u0011\u0004\f\u001b\u001a\u001b", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 98)).intern();
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(m655(53 - TextUtils.indexOf("", ""), "\u0014\u0004\t\u0004««\u0000\u0007\u0007\u0004\u009c\u009c\u0012\f\t\u0000\u0016\u0006\u001c\u001d\u0011\u000f\u0004\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u000b\u001c\u001c\u0012\u0013\u0012\u000e\u0006\u000f\u0011\u0003\u0011\u0006\u001c\u001a\u001bY", (byte) (57 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern());
                                        sb5.append(cpVar.m1739());
                                        sb5.append(m655((ViewConfiguration.getJumpTapTimeout() >> 16) + 11, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007{", (byte) (77 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
                                        m.m2968(strIntern4, sb5.toString());
                                    }

                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* JADX INFO: renamed from: ｋ */
                                    public final void mo254() {
                                        int i14 = f499 + 39;
                                        f498 = i14 % 128;
                                        if (i14 % 2 == 0) {
                                            cpVar.m1736();
                                            av.m617(av.this);
                                            throw null;
                                        }
                                        cpVar.m1736();
                                        ba baVarM618 = av.m617(av.this);
                                        if (baVarM618 != null) {
                                            p.m2998(baVarM618.new AnonymousClass5(strM1737, az.a.f594));
                                        }
                                        String strIntern3 = m655((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (83 - Gravity.getAbsoluteGravity(0, 0))).intern();
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append(cpVar.m1739());
                                        sb4.append(m655((ViewConfiguration.getKeyRepeatDelay() >> 16) + 35, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007\u000b\u0006\u0010\u0000\u0005\u0004½½\u000e\r¶¶\u0010\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\u000f\u0005®", (byte) (Color.red(0) + 74)).intern());
                                        m.m2963(strIntern3, sb4.toString());
                                        f499 = (f498 + 59) % 128;
                                    }

                                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                    private static String m655(int i14, String str2, byte b10) {
                                        String str3;
                                        Object charArray = str2;
                                        if (str2 != null) {
                                            charArray = str2.toCharArray();
                                        }
                                        char[] cArr = (char[]) charArray;
                                        synchronized (j.f2647) {
                                            try {
                                                char[] cArr2 = f500;
                                                char c4 = f501;
                                                char[] cArr3 = new char[i14];
                                                if (i14 % 2 != 0) {
                                                    i14--;
                                                    cArr3[i14] = (char) (cArr[i14] - b10);
                                                }
                                                if (i14 > 1) {
                                                    j.f2654 = 0;
                                                    while (true) {
                                                        int i15 = j.f2654;
                                                        if (i15 >= i14) {
                                                            break;
                                                        }
                                                        j.f2653 = cArr[i15];
                                                        j.f2650 = cArr[j.f2654 + 1];
                                                        if (j.f2653 == j.f2650) {
                                                            cArr3[j.f2654] = (char) (j.f2653 - b10);
                                                            cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                                                        } else {
                                                            j.f2652 = j.f2653 / c4;
                                                            j.f2649 = j.f2653 % c4;
                                                            j.f2651 = j.f2650 / c4;
                                                            j.f2648 = j.f2650 % c4;
                                                            if (j.f2649 == j.f2648) {
                                                                j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                                                j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                                                int i16 = (j.f2652 * c4) + j.f2649;
                                                                int i17 = (j.f2651 * c4) + j.f2648;
                                                                int i18 = j.f2654;
                                                                cArr3[i18] = cArr2[i16];
                                                                cArr3[i18 + 1] = cArr2[i17];
                                                            } else if (j.f2652 == j.f2651) {
                                                                j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                                                j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                                                int i19 = (j.f2652 * c4) + j.f2649;
                                                                int i110 = (j.f2651 * c4) + j.f2648;
                                                                int i111 = j.f2654;
                                                                cArr3[i111] = cArr2[i19];
                                                                cArr3[i111 + 1] = cArr2[i110];
                                                            } else {
                                                                int i20 = (j.f2652 * c4) + j.f2648;
                                                                int i21 = (j.f2651 * c4) + j.f2649;
                                                                int i22 = j.f2654;
                                                                cArr3[i22] = cArr2[i20];
                                                                cArr3[i22 + 1] = cArr2[i21];
                                                            }
                                                        }
                                                        j.f2654 += 2;
                                                    }
                                                }
                                                str3 = new String(cArr3);
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                        return str3;
                                    }
                                });
                                av.m609(av.this).add(cpVar);
                            } else {
                                jSONObjectM631.put(m653("쿈쓜\ud9ea", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2833).intern(), false);
                                if (baVarM617 != null) {
                                    p.m2998(baVarM617.new AnonymousClass3(strM1737, az.b.f603));
                                }
                                String strIntern3 = m652("矧퉋꛳瞮\ue077忪鈓繩푒三\ueed6쿛妼濫器\u07b9", 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str);
                                sb4.append(m652("줪ᶾ䄷䬰\uf5eb䗷器\u07b9妢⮊\uf783陃\ue28e㑬", 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                                sb4.append(strM1735);
                                kl.m2893(strIntern3, f2.m(sb4, m652("컬\uf753प竑\udc37哆蛍쉰棛눚蛍쉰⛖듘\ue9a5ᴑ枖\u1977씿櫕ᰘ躍\uf668\u0dfe줉킯㬩苾嬧䙎\uf783陃\ueb7d㭛鉼\ue425枖\u1977", Color.green(0) + 38)), null, true, true, false);
                                if (cpVar.m1730()) {
                                    ISAdQualityInitListener iSAdQualityInitListenerM648 = av.this.m648();
                                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(cpVar.m1739());
                                    sb5.append(m652("줪ᶾ䄷䬰\uf5eb䗷器\u07b9妢⮊\uf783陃\ue28e㑬", ImageFormat.getBitsPerPixel(0) + 14).intern());
                                    sb5.append(cpVar.m1735());
                                    sb5.append(m652("컬\uf753प竑\udc37哆蛍쉰棛눚蛍쉰⛖듘\ue9a5ᴑ枖\u1977씿櫕ᰘ躍\uf668\u0dfe줉킯㬩苾嬧䙎\uf783陃\ueb7d㭛鉼\ue425枖\u1977", ExpandableListView.getPackedPositionType(0L) + 38).intern());
                                    iSAdQualityInitListenerM648.adQualitySdkInitFailed(iSAdQualityInitError, sb5.toString());
                                    f492 = (f487 + 39) % 128;
                                }
                            }
                        } else if (av.m616(cpVar, strM1735)) {
                            p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.2.1

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static int f498 = 1;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f499 = 0;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static char[] f500 = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', ' ', 's', 'u', 'f', 'l', 'y', 'i', 'z', 'd', 'E', 'v', 'j', 'A', 'Q', 'S', 'D', 'K', 'w', 'h', 'I', '.', 'F', 'G', 'H', 'J', 'L'};

                                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                private static char f501 = 6;

                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* JADX INFO: renamed from: ﻐ */
                                public final void mo654(Throwable th2) {
                                    try {
                                        ((JSONObject) av.m587(av.this).get(cpVar.m1737())).put(m655(4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u000e\u0004\u0011\u0004", (byte) (KeyEvent.normalizeMetaState(0) + 81)).intern(), false);
                                        f498 = (f499 + 95) % 128;
                                    } catch (JSONException e10) {
                                        m.m2983(m655(View.MeasureSpec.getMode(0) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (TextUtils.getTrimmedLength("") + 83)).intern(), m655((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, "\u0012\u0007\u0007\u0000\u0007\u000b\t\u0005\u0087\u0087\u000e\u0004\n\u000b\u000e\u0004\u0011\u0004\u000b\u0004\u0004\u0007\u0005\u0002\u0081\u0081\u0004\u0005\u0000\u0002\u0007\u000b\u0015\u0002\u0007\u0006\r\u0004\u0004\b\u0017\t\u0002\u0003", (byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19)).intern(), e10);
                                    }
                                    ba baVarM618 = av.m617(av.this);
                                    if (baVarM618 != null) {
                                        p.m2998(baVarM618.new AnonymousClass3(strM1737, az.b.f606));
                                        f498 = (f499 + 5) % 128;
                                    }
                                    String strIntern4 = m655(16 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (Color.alpha(0) + 83)).intern();
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(m655((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 19, "\u0012\u0007\u0007\u0000\u0007\u000b\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u0092", (byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 114)).intern());
                                    sb6.append(cpVar.m1739());
                                    kl.m2893(strIntern4, f2.m(sb6, m655(10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007", (byte) ((Process.myPid() >> 22) + 58))), th2, true, true, true);
                                    String strIntern5 = m655(11 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0017\u0013\u0012\u0011\u000e\u0014\u0011\u0004\f\u001b\u001a\u001b", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 98)).intern();
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(m655(53 - TextUtils.indexOf("", ""), "\u0014\u0004\t\u0004««\u0000\u0007\u0007\u0004\u009c\u009c\u0012\f\t\u0000\u0016\u0006\u001c\u001d\u0011\u000f\u0004\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\f\u0011\u0003\b\u000b\u001c\u001c\u0012\u0013\u0012\u000e\u0006\u000f\u0011\u0003\u0011\u0006\u001c\u001a\u001bY", (byte) (57 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern());
                                    sb7.append(cpVar.m1739());
                                    sb7.append(m655((ViewConfiguration.getJumpTapTimeout() >> 16) + 11, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007{", (byte) (77 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
                                    m.m2968(strIntern5, sb7.toString());
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* JADX INFO: renamed from: ｋ */
                                public final void mo254() {
                                    int i14 = f499 + 39;
                                    f498 = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        cpVar.m1736();
                                        av.m617(av.this);
                                        throw null;
                                    }
                                    cpVar.m1736();
                                    ba baVarM618 = av.m617(av.this);
                                    if (baVarM618 != null) {
                                        p.m2998(baVarM618.new AnonymousClass5(strM1737, az.a.f594));
                                    }
                                    String strIntern4 = m655((ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, "\u0001\u0002ÁÁ\u0004\u0005\u0000\u0002\u0007\b\u000e\b\t\n\u0000\t", (byte) (83 - Gravity.getAbsoluteGravity(0, 0))).intern();
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(cpVar.m1739());
                                    sb6.append(m655((ViewConfiguration.getKeyRepeatDelay() >> 16) + 35, "\u0010\n\u0002\u0003\u0003\u0004\u0005\u0000\u0000\u0007\u000b\u0006\u0010\u0000\u0005\u0004½½\u000e\r¶¶\u0010\t\u000e\u0004\u0011\u0004\u000e\n\u000f\u0011\u000f\u0005®", (byte) (Color.red(0) + 74)).intern());
                                    m.m2963(strIntern4, sb6.toString());
                                    f499 = (f498 + 59) % 128;
                                }

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static String m655(int i14, String str2, byte b10) {
                                    String str3;
                                    Object charArray = str2;
                                    if (str2 != null) {
                                        charArray = str2.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (j.f2647) {
                                        try {
                                            char[] cArr2 = f500;
                                            char c4 = f501;
                                            char[] cArr3 = new char[i14];
                                            if (i14 % 2 != 0) {
                                                i14--;
                                                cArr3[i14] = (char) (cArr[i14] - b10);
                                            }
                                            if (i14 > 1) {
                                                j.f2654 = 0;
                                                while (true) {
                                                    int i15 = j.f2654;
                                                    if (i15 >= i14) {
                                                        break;
                                                    }
                                                    j.f2653 = cArr[i15];
                                                    j.f2650 = cArr[j.f2654 + 1];
                                                    if (j.f2653 == j.f2650) {
                                                        cArr3[j.f2654] = (char) (j.f2653 - b10);
                                                        cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                                                    } else {
                                                        j.f2652 = j.f2653 / c4;
                                                        j.f2649 = j.f2653 % c4;
                                                        j.f2651 = j.f2650 / c4;
                                                        j.f2648 = j.f2650 % c4;
                                                        if (j.f2649 == j.f2648) {
                                                            j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                                            j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                                            int i16 = (j.f2652 * c4) + j.f2649;
                                                            int i17 = (j.f2651 * c4) + j.f2648;
                                                            int i18 = j.f2654;
                                                            cArr3[i18] = cArr2[i16];
                                                            cArr3[i18 + 1] = cArr2[i17];
                                                        } else if (j.f2652 == j.f2651) {
                                                            j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                                            j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                                            int i19 = (j.f2652 * c4) + j.f2649;
                                                            int i110 = (j.f2651 * c4) + j.f2648;
                                                            int i111 = j.f2654;
                                                            cArr3[i111] = cArr2[i19];
                                                            cArr3[i111 + 1] = cArr2[i110];
                                                        } else {
                                                            int i20 = (j.f2652 * c4) + j.f2648;
                                                            int i21 = (j.f2651 * c4) + j.f2649;
                                                            int i22 = j.f2654;
                                                            cArr3[i22] = cArr2[i20];
                                                            cArr3[i22 + 1] = cArr2[i21];
                                                        }
                                                    }
                                                    j.f2654 += 2;
                                                }
                                            }
                                            str3 = new String(cArr3);
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    return str3;
                                }
                            });
                            av.m609(av.this).add(cpVar);
                        } else {
                            jSONObjectM631.put(m653("쿈쓜\ud9ea", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2833).intern(), false);
                            if (baVarM617 != null) {
                                p.m2998(baVarM617.new AnonymousClass3(strM1737, az.b.f603));
                            }
                            String strIntern4 = m652("矧퉋꛳瞮\ue077忪鈓繩푒三\ueed6쿛妼濫器\u07b9", 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str);
                            sb6.append(m652("줪ᶾ䄷䬰\uf5eb䗷器\u07b9妢⮊\uf783陃\ue28e㑬", 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                            sb6.append(strM1735);
                            kl.m2893(strIntern4, f2.m(sb6, m652("컬\uf753प竑\udc37哆蛍쉰棛눚蛍쉰⛖듘\ue9a5ᴑ枖\u1977씿櫕ᰘ躍\uf668\u0dfe줉킯㬩苾嬧䙎\uf783陃\ueb7d㭛鉼\ue425枖\u1977", Color.green(0) + 38)), null, true, true, false);
                            if (cpVar.m1730()) {
                                ISAdQualityInitListener iSAdQualityInitListenerM649 = av.this.m648();
                                ISAdQualityInitError iSAdQualityInitError2 = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(cpVar.m1739());
                                sb7.append(m652("줪ᶾ䄷䬰\uf5eb䗷器\u07b9妢⮊\uf783陃\ue28e㑬", ImageFormat.getBitsPerPixel(0) + 14).intern());
                                sb7.append(cpVar.m1735());
                                sb7.append(m652("컬\uf753प竑\udc37哆蛍쉰棛눚蛍쉰⛖듘\ue9a5ᴑ枖\u1977씿櫕ᰘ躍\uf668\u0dfe줉킯㬩苾嬧䙎\uf783陃\ueb7d㭛鉼\ue425枖\u1977", ExpandableListView.getPackedPositionType(0L) + 38).intern());
                                iSAdQualityInitListenerM649.adQualitySdkInitFailed(iSAdQualityInitError2, sb7.toString());
                                f492 = (f487 + 39) % 128;
                            }
                        }
                    }
                    jSONObjectM631.remove(m653("쿞괼", 25344 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                }
            });
            return;
        }
        this.f441.get();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m605(String str, JSONObject jSONObject) {
        ba baVar = this.f435;
        if (baVar != null) {
            p.m2998(baVar.new AnonymousClass5(str, az.a.f595));
            f427 = (f425 + 29) % 128;
        }
        if (jSONObject != null) {
            try {
                jSONObject.put(m618("荈ᠸ떱", (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 39798).intern(), true);
                int i10 = f425 + 73;
                f427 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m612(final Context context, final String str, final String str2, final gt gtVar, final cp cpVar, final boolean z10, final be beVar, final je jeVar) {
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.7

            /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
            private static int f524 = 0;

            /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
            private static int f525 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char[] f527 = {'C', 5133, 10410, 15688, 20973, 25993, 31288, 36545, 41826, 46911, 52149, 57432, 62713, 2205, 7481, 12748, 'I', 5132, 10413, 15698, 20961, 25995, 31264, 36551, 41834, 46875, 52154, 57425, 62648, 56191, 53071, 62462, 58900, 35512, 48833, 41334, 21969, 30764, 27714, 4325, 15111, 12194, 54214, 50807, 60046, 40205, 33277, '(', 5121, 10405, 15685, 20960, 25999, 31272, 36487, '(', 5124, 10401, 15698, 20971, 25986, 31273, 36554, 41785};

            /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
            private static long f526 = -8690789127003630494L;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m660(char c4, int i10, int i11) {
                String str3;
                synchronized (c.f1153) {
                    try {
                        char[] cArr = new char[i11];
                        c.f1154 = 0;
                        while (true) {
                            int i12 = c.f1154;
                            if (i12 < i11) {
                                cArr[i12] = (char) ((((long) f527[i10 + i12]) ^ (((long) i12) * f526)) ^ ((long) c4));
                                c.f1154 = i12 + 1;
                            } else {
                                str3 = new String(cArr);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                ba baVarM617;
                char cMyTid;
                int defaultSize;
                int longPressTimeout;
                if (av.m634(av.this).get() || cpVar == null) {
                    return;
                }
                f525 = (f524 + 99) % 128;
                if (av.m582(av.this).contains(gtVar) || (baVarM617 = av.m617(av.this)) == null) {
                    return;
                }
                p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.ba.4

                    /* JADX INFO: renamed from: ﻛ */
                    private /* synthetic */ String f617;

                    /* JADX INFO: renamed from: ﾇ */
                    private /* synthetic */ boolean f618;

                    /* JADX INFO: renamed from: ﾒ */
                    private /* synthetic */ cp f619;

                    public AnonymousClass4() {
                        str = str;
                        cpVar = cpVar;
                        z = z;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        az azVarM706 = ba.m706(ba.this, str);
                        if (azVarM706 != null) {
                            azVarM706.m698(cpVar);
                        }
                    }
                });
                if (!cpVar.m1730()) {
                    int i10 = f525 + 31;
                    f524 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                    je jeVar2 = jeVar;
                    if (jeVar2 != null) {
                        p.m2996(jeVar2);
                    }
                }
                if (!av.m606(cpVar)) {
                    p.m2998(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.7.5

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int[] f537 = {-1062878114, -96155628, -979946817, -1863371391, 361597796, 1409414449, -1846634432, -1338069574, -1996832396, -338645461, -686005585, 1228166387, 133588651, -2106968390, 1575203545, -1220551231, -2060771456, 793528245};

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static int f538 = 1;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f539;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static String m661(int[] iArr, int i11) {
                            String str3;
                            synchronized (a.f61) {
                                try {
                                    char[] cArr = new char[4];
                                    char[] cArr2 = new char[iArr.length << 1];
                                    int[] iArr2 = (int[]) f537.clone();
                                    a.f58 = 0;
                                    while (true) {
                                        int i12 = a.f58;
                                        if (i12 < iArr.length) {
                                            int i13 = iArr[i12];
                                            char c4 = (char) (i13 >> 16);
                                            cArr[0] = c4;
                                            char c5 = (char) i13;
                                            cArr[1] = c5;
                                            char c10 = (char) (iArr[i12 + 1] >> 16);
                                            cArr[2] = c10;
                                            char c11 = (char) iArr[i12 + 1];
                                            cArr[3] = c11;
                                            a.f59 = (c4 << 16) + c5;
                                            a.f60 = (c10 << 16) + c11;
                                            a.m199(iArr2);
                                            for (int i14 = 0; i14 < 16; i14++) {
                                                int i15 = a.f59 ^ iArr2[i14];
                                                a.f59 = i15;
                                                int iM200 = a.m200(i15) ^ a.f60;
                                                int i16 = a.f59;
                                                a.f59 = iM200;
                                                a.f60 = i16;
                                            }
                                            int i17 = a.f59;
                                            int i18 = a.f60;
                                            a.f59 = i18;
                                            a.f60 = i17;
                                            int i19 = i17 ^ iArr2[16];
                                            a.f60 = i19;
                                            int i20 = i18 ^ iArr2[17];
                                            a.f59 = i20;
                                            cArr[0] = (char) (i20 >>> 16);
                                            cArr[1] = (char) i20;
                                            cArr[2] = (char) (i19 >>> 16);
                                            cArr[3] = (char) i19;
                                            a.m199(iArr2);
                                            int i21 = a.f58;
                                            cArr2[i21 << 1] = cArr[0];
                                            cArr2[(i21 << 1) + 1] = cArr[1];
                                            cArr2[(i21 << 1) + 2] = cArr[2];
                                            cArr2[(i21 << 1) + 3] = cArr[3];
                                            a.f58 = i21 + 2;
                                        } else {
                                            str3 = new String(cArr2, 0, i11);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str3;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            if (av.m597(av.this).containsKey(cpVar.m1737())) {
                                return;
                            }
                            int i11 = f538 + 107;
                            f539 = i11 % 128;
                            if (i11 % 2 != 0) {
                                av.m617(av.this);
                                throw null;
                            }
                            ba baVarM618 = av.m617(av.this);
                            if (baVarM618 == null) {
                                int i12 = f539 + 123;
                                f538 = i12 % 128;
                                if (i12 % 2 == 0) {
                                    throw null;
                                }
                                return;
                            }
                            p.m2998(baVarM618.new AnonymousClass3(cpVar.m1737(), az.b.f604));
                            AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                            JSONObject jSONObjectM631 = av.m631(av.this, cpVar);
                            try {
                                jSONObjectM631.put(m661(new int[]{1533161806, 1665486804}, 3 - View.resolveSizeAndState(0, 0, 0)).intern(), false);
                            } catch (JSONException unused) {
                            }
                            av.m587(av.this).put(cpVar.m1737(), jSONObjectM631);
                            String strM709 = baVarM618.m709(cpVar.m1737());
                            av.m597(av.this).put(cpVar.m1737(), strM709);
                            if (cpVar.m1730()) {
                                ISAdQualityInitListener iSAdQualityInitListenerM648 = av.this.m648();
                                ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(cpVar.m1739());
                                sb2.append(m661(new int[]{1987470961, 416836929, 504386406, -1665254015, -836126619, -1593379859, -814310993, -124558823}, View.resolveSizeAndState(0, 0, 0) + 13).intern());
                                sb2.append(cpVar.m1735());
                                sb2.append(m661(new int[]{155422545, -951080553, -1213862073, 1300878889, 797235886, 1983465650, -780508520, 1675149943, 1987470961, 416836929, 504386406, -1665254015, -836126619, -1593379859, -814310993, -124558823}, 29 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
                                sb2.append(cpVar.m1731());
                                sb2.append(m661(new int[]{-513825844, -1756913284, 1689083623, -534713635, -305680078, -359377100}, TextUtils.indexOf((CharSequence) "", '0', 0) + 10).intern());
                                iSAdQualityInitListenerM648.adQualitySdkInitFailed(iSAdQualityInitError, sb2.toString());
                            }
                            kl.m2893(m661(new int[]{1417784286, 880069630, 1224740807, -921078062, -495133024, -1476577129, -732707976, -2015526773}, 16 - Gravity.getAbsoluteGravity(0, 0)).intern(), strM709, null, true, true, false);
                        }
                    });
                    return;
                }
                String strIntern = m660((char) View.MeasureSpec.getSize(0), (-1) - ImageFormat.getBitsPerPixel(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m660((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 13).intern());
                sb2.append(str);
                sb2.append(m660((char) (TextUtils.indexOf("", "", 0) + 56159), 29 - ExpandableListView.getPackedPositionType(0L), 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern());
                if (z10) {
                    f525 = (f524 + 95) % 128;
                    cMyTid = (char) TextUtils.getOffsetAfter("", 0);
                    defaultSize = (ViewConfiguration.getJumpTapTimeout() >> 16) + 47;
                    longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 8;
                } else {
                    cMyTid = (char) (Process.myTid() >> 22);
                    defaultSize = View.getDefaultSize(0, 0) + 55;
                    longPressTimeout = 8 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                }
                sb2.append(m660(cMyTid, defaultSize, longPressTimeout).intern());
                cn.m1711(strIntern, sb2.toString());
                beVar.m822();
                if (cpVar.m1730()) {
                    int i11 = (f524 + 11) % 128;
                    f525 = i11;
                    je jeVar3 = jeVar;
                    if (jeVar3 != null) {
                        int i12 = i11 + 67;
                        f524 = i12 % 128;
                        if (i12 % 2 != 0) {
                            p.m2996(jeVar3);
                            int i13 = 41 / 0;
                        } else {
                            p.m2996(jeVar3);
                        }
                    }
                }
                if (s.m3035().m3060()) {
                    return;
                }
                av.m623(av.this, cpVar, str);
                if (av.m625(av.this, cpVar.m1737())) {
                    return;
                }
                av.m582(av.this).add(gtVar);
            }
        });
        int i10 = f425 + 11;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private long m607(jl.e eVar) {
        f425 = (f427 + 83) % 128;
        if (ar.m468().mo494()) {
            int i10 = (f425 + 69) % 128;
            f427 = i10;
            f425 = (i10 + 13) % 128;
            return 2000L;
        }
        if (eVar == null || this.f430.m2617(eVar)) {
            return 0L;
        }
        int i11 = f427 + 39;
        f425 = i11 % 128;
        if (i11 % 2 != 0) {
            return 2000L;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m601(final Context context, final String str, final String str2, final List<gt> list, final je jeVar) {
        p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.av.5

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f514 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f515 = 115;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f516 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m659(int i10, boolean z10, int i11, String str3, int i12) {
                String str4;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (d.f1625) {
                    try {
                        char[] cArr2 = new char[i10];
                        d.f1622 = 0;
                        while (true) {
                            int i13 = d.f1622;
                            if (i13 >= i10) {
                                break;
                            }
                            d.f1624 = cArr[i13];
                            cArr2[d.f1622] = (char) (d.f1624 + i11);
                            int i14 = d.f1622;
                            cArr2[i14] = (char) (cArr2[i14] - f515);
                            d.f1622 = i14 + 1;
                        }
                        if (i12 > 0) {
                            d.f1623 = i12;
                            char[] cArr3 = new char[i10];
                            System.arraycopy(cArr2, 0, cArr3, 0, i10);
                            int i15 = d.f1623;
                            System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                            int i16 = d.f1623;
                            System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i10];
                            d.f1622 = 0;
                            while (true) {
                                int i17 = d.f1622;
                                if (i17 >= i10) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i10 - i17) - 1];
                                d.f1622 = i17 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str4 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                String strIntern = m659(MotionEvent.axisFromString("") + 17, false, (KeyEvent.getMaxKeyCode() >> 16) + 217, "\t\b\b\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd", (Process.myTid() >> 22) + 15).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m659(23 - (ViewConfiguration.getFadingEdgeLength() >> 16), false, TextUtils.getOffsetAfter("", 0) + 214, "\u0006\u0017\u0006\u000b\u0004ﾽ\u0000\f\u000b\u000b\u0002\u0000\u0011\f\u000fﾽ￦\u000b\u0006\u0011\u0006\ufffe\t", 16 - Color.green(0)).intern());
                sb2.append(str2);
                m.m2963(strIntern, sb2.toString());
                try {
                    av.m637(av.this, context, str, str2, list, jeVar);
                    f514 = (f516 + 107) % 128;
                } catch (Throwable th2) {
                    ba baVarM617 = av.m617(av.this);
                    if (baVarM617 != null) {
                        p.m2998(baVarM617.new AnonymousClass3(str2, az.b.f605));
                        f516 = (f514 + InterfaceC0435l1.d.b.f29109f) % 128;
                    }
                    av.m597(av.this).put(str, kl.m2895(th2).toString());
                    String strIntern2 = m659((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 16, false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 217, "\t\b\b\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd", 15 - TextUtils.indexOf("", "")).intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m659(25 - TextUtils.getTrimmedLength(""), true, 213 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u0002\u0004\r\r\u000e\u0002\uffbf\u0006\r\b\u0013\u0000\u0004\u0011\u0002\uffbf\u0011\u000e\u0011\u0011￤\uffbf\u0011\u000e\u0013", 20 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                    sb3.append(str2);
                    kl.m2893(strIntern2, sb3.toString(), th2, true, true, false);
                }
            }
        });
        int i10 = f425 + InterfaceC0435l1.d.b.f29114k;
        f427 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 30 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private cp m595(Context context, String str, be beVar) {
        int i10 = f425;
        f427 = (i10 + 125) % 128;
        if (str != null) {
            return new cp(context, new dg(str, this.f433), this.f431, this.f434, beVar);
        }
        f427 = (i10 + 41) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m645(String str, List<Object> list) {
        int i10;
        if (this.f441.get()) {
            i10 = f425 + 43;
        } else {
            Iterator<cp> it = m584().iterator();
            while (it.hasNext()) {
                int i11 = f425 + 69;
                f427 = i11 % 128;
                if (i11 % 2 != 0) {
                    it.next().m1740(str, list);
                    throw null;
                }
                it.next().m1740(str, list);
            }
            i10 = f425 + 125;
        }
        f427 = i10 % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m598(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(is.f2563, str);
        } catch (JSONException e10) {
            m.m2983(m618("药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇", 3671 - ExpandableListView.getPackedPositionGroup(0L)).intern(), m618("荩〩\ue5b0餦亂ɟ랅欟ᣱ챢臾㕘\uead6鹀厎¶됳榥ᴜ튜蘃㮛\uef79鳯値ׅ륟滓≛휾蒱㠫\uedecꄑ嚑ਆ뿾", 45942 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), e10);
        }
        int i10 = f425 + 39;
        f427 = i10 % 128;
        if (i10 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m599(Map<String, JSONObject> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            int i10 = f425 + 43;
            f427 = i10 % 128;
            if (i10 % 2 != 0) {
                String str = (String) it.next();
                jSONObject2.put(str.toLowerCase(), map.get(str));
                int i11 = 26 / 0;
            } else {
                String str2 = (String) it.next();
                jSONObject2.put(str2.toLowerCase(), map.get(str2));
            }
        }
        jSONObject.put(m618("荚ｮ笠\uf7cc", (ViewConfiguration.getTouchSlop() >> 8) + 31793).intern(), jSONObject2);
        int i12 = f425 + 27;
        f427 = i12 % 128;
        if (i12 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m596(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f426, i10, cArr, 0, i11);
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
