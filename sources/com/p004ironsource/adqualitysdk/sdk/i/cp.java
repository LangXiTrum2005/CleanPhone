package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
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
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.p004ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class cp {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1324 = 0;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1325 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1326 = 32023;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char f1327 = 35948;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1328 = 24829;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static long f1329 = -2487500438217411902L;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char f1330 = 3666;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private jf f1331 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private cn f1332;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private jm f1333;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1334;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private y f1335;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private hs f1336;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ch f1337;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private de f1338;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private bg f1339;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private dr f1340;

    public class a<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$a$1, reason: invalid class name */
        public class AnonymousClass1 extends it {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1416;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ p f1417;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1418;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1419;

            public AnonymousClass1(p pVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1417 = pVar;
                this.f1416 = jSONObject;
                this.f1419 = obj;
                this.f1418 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1417.mo1633(this.f1416, this.f1419, this.f1418);
            }
        }
    }

    public class b<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$b$3, reason: invalid class name */
        public class AnonymousClass3 extends it {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1420;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1421;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1422;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ p f1423;

            public AnonymousClass3(p pVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1423 = pVar;
                this.f1422 = jSONObject;
                this.f1421 = obj;
                this.f1420 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1423.mo258(this.f1422, this.f1421, this.f1420);
            }
        }
    }

    public class c<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$c$3, reason: invalid class name */
        public class AnonymousClass3 extends it {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1424;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1425;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1426;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ p f1427;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1428;

            public AnonymousClass3(p pVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1427 = pVar;
                this.f1428 = jSONObject;
                this.f1425 = obj;
                this.f1426 = obj2;
                this.f1424 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1427.mo1643(this.f1428, this.f1425, this.f1426, this.f1424);
            }
        }
    }

    public class d<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$d$3, reason: invalid class name */
        public class AnonymousClass3 extends it {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1429;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1430;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1431;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1432;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ p f1433;

            public AnonymousClass3(p pVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1433 = pVar;
                this.f1432 = jSONObject;
                this.f1429 = obj;
                this.f1431 = obj2;
                this.f1430 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1433.mo1635(this.f1432, this.f1429, this.f1431, this.f1430);
            }
        }
    }

    public class e<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$e$5, reason: invalid class name */
        public class AnonymousClass5 extends it {

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1434;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1435;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1436;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ p f1437;

            public AnonymousClass5(p pVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1437 = pVar;
                this.f1435 = jSONObject;
                this.f1436 = obj;
                this.f1434 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1437.mo265(this.f1435, this.f1436, this.f1434);
            }
        }
    }

    public class f<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$f$1, reason: invalid class name */
        public class AnonymousClass1 extends it {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1438;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1439;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ p f1440;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1441;

            public AnonymousClass1(p pVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1440 = pVar;
                this.f1438 = jSONObject;
                this.f1441 = obj;
                this.f1439 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1440.mo1638(this.f1438, this.f1441, this.f1439);
            }
        }
    }

    public class g<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$g$5, reason: invalid class name */
        public class AnonymousClass5 extends it {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1442;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1443;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1444;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ p f1445;

            public AnonymousClass5(p pVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1445 = pVar;
                this.f1443 = jSONObject;
                this.f1442 = obj;
                this.f1444 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1445.mo1642(this.f1443, this.f1442, this.f1444);
            }
        }
    }

    public class j<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cp$j$3, reason: invalid class name */
        public class AnonymousClass3 extends it {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1446;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ p f1447;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1448;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1449;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1450;

            public AnonymousClass3(p pVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1447 = pVar;
                this.f1446 = jSONObject;
                this.f1449 = obj;
                this.f1450 = obj2;
                this.f1448 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                this.f1447.mo1639(this.f1446, this.f1449, this.f1450, this.f1448);
            }
        }
    }

    public cp(cn cnVar, de deVar, bg bgVar, hs hsVar, dr drVar) {
        this.f1336 = hsVar;
        dr drVar2 = new dr(new HashMap(), drVar, true);
        this.f1340 = drVar2;
        drVar2.m1982(m1626().m2251());
        drVar.m1981(hsVar.m2256(), this);
        this.f1338 = deVar;
        this.f1339 = bgVar;
        this.f1337 = m1570();
        this.f1332 = cnVar;
        this.f1335 = new y();
        m1596(m1601("괋굙秥喈큮䭂ち䡇晷葊故덄㭗녞깯﹌챶\uea51鍱⥂脅❮쑂ᑡ婗偦ॅ彬潒赭牙", ViewConfiguration.getKeyRepeatDelay() >> 16).intern(), new ArrayList());
        m1574();
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private jf m1568() {
        jf jfVar = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.1
            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                cp cpVar = cp.this;
                cpVar.m1625(ik.f2436, cp.m1588(cpVar, activity, null));
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                cp cpVar = cp.this;
                cpVar.m1625(ik.f2435, cp.m1588(cpVar, activity, null));
            }
        };
        int i2 = f1325 + 65;
        f1324 = i2 % 128;
        if (i2 % 2 == 0) {
            return jfVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private void m1569() {
        f1324 = (f1325 + 27) % 128;
        this.f1335.m3013();
        int i2 = f1324 + 123;
        f1325 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private ch m1570() {
        ch chVar = new ch() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2
            @Override // com.p004ironsource.adqualitysdk.sdk.i.ch
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1479(final String str, final List<Object> list) {
                final boolean z2 = true;
                final boolean z3 = false;
                cp.m1579(cp.this, str, true, false, list);
                cp.m1594(cp.this, new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        cp.m1579(cp.this, str, false, z3, list);
                    }
                }, false);
                cp.m1594(cp.this, new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.2.5
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        cp.m1579(cp.this, str, false, z2, list);
                    }
                }, true);
            }
        };
        f1324 = (f1325 + 35) % 128;
        return chVar;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1571() {
        f1324 = (f1325 + 101) % 128;
        this.f1335.m3016();
        int i2 = f1324 + 79;
        f1325 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m1572() {
        f1324 = (f1325 + 23) % 128;
        this.f1335.m3014();
        int i2 = f1324 + 53;
        f1325 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private dl m1573() {
        int i2 = f1325 + 97;
        f1324 = i2 % 128;
        if (i2 % 2 != 0) {
            m1618().m1544();
            throw null;
        }
        dl dlVarM1544 = m1618().m1544();
        int i3 = f1324 + 53;
        f1325 = i3 % 128;
        if (i3 % 2 != 0) {
            return dlVarM1544;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m1574() {
        f1325 = (f1324 + 23) % 128;
        for (dn dnVar : m1626().m2254()) {
            if (m1599(dnVar)) {
                f1325 = (f1324 + 5) % 128;
                m1603(dnVar);
            }
        }
        f1325 = (f1324 + 51) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m1579(cp cpVar, String str, boolean z2, boolean z3, List list) {
        int i2 = f1324 + 81;
        f1325 = i2 % 128;
        int i3 = i2 % 2;
        cpVar.m1597(str, z2, z3, list);
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1588(cp cpVar, Activity activity, Bundle bundle) {
        f1325 = (f1324 + 23) % 128;
        JSONObject jSONObjectM1587 = cpVar.m1587(activity, bundle);
        f1324 = (f1325 + 101) % 128;
        return jSONObjectM1587;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1594(cp cpVar, io ioVar, boolean z2) {
        f1324 = (f1325 + 109) % 128;
        cpVar.m1581(ioVar, z2);
        int i2 = f1324 + 75;
        f1325 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ dr m1605(cp cpVar) {
        int i2 = f1324 + 47;
        f1325 = i2 % 128;
        int i3 = i2 % 2;
        dr drVar = cpVar.f1340;
        if (i3 != 0) {
            return drVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final void m1612() {
        int i2 = f1325 + 71;
        f1324 = i2 % 128;
        if (i2 % 2 != 0) {
            m1569();
            m1571();
            m1572();
            int i3 = 57 / 0;
            if (this.f1331 != null) {
                ji.m2594().m2596(this.f1331);
                this.f1331 = null;
            }
        } else {
            m1569();
            m1571();
            m1572();
            if (this.f1331 != null) {
                ji.m2594().m2596(this.f1331);
                this.f1331 = null;
            }
        }
        jm jmVar = this.f1333;
        if (jmVar != null) {
            jmVar.m2631();
            this.f1333 = null;
        }
        this.f1337 = null;
        f1325 = (f1324 + 105) % 128;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final de m1613() {
        int i2 = f1325;
        int i3 = i2 + 49;
        f1324 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        de deVar = this.f1338;
        int i4 = i2 + 55;
        f1324 = i4 % 128;
        if (i4 % 2 == 0) {
            return deVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final dr m1614() {
        int i2 = f1325;
        dr drVar = this.f1340;
        int i3 = i2 + 11;
        f1324 = i3 % 128;
        if (i3 % 2 == 0) {
            return drVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final ch m1615() {
        int i2 = f1324 + 47;
        f1325 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1337;
        }
        int i3 = 96 / 0;
        return this.f1337;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1616() {
        StringBuilder sb = new StringBuilder();
        sb.append(m1618().m1553());
        sb.append(m1608("셋웭", -TextUtils.lastIndexOf("", '0', 0)).intern());
        sb.append(m1626().m2256());
        String string = sb.toString();
        f1325 = (f1324 + 5) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final JSONObject m1617() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ik.f2471, m1618().m1557());
            jSONObject.put(ik.f2424, m1618().m1550());
            jSONObject.put(ik.f2426, m1618().m1552());
            f1324 = (f1325 + 1) % 128;
        } catch (JSONException e2) {
            String strIntern = m1601("ႀგ鶃䤄紕꼤Ⳮ\ue53c\udbfc怬秉ḿ蛜唸닣匷燽ื追萹", Process.getGidForName("") + 1).intern();
            StringBuilder sb = new StringBuilder();
            sb.append(m1608("䷎ᚮ\uf8a2駎夫䠫ꂈ먲珳뭺嬹๓僭䁓ꨚ䐆栵㴘簌櫵ᔕ겗䂖忌㙔᧒ٶ㹗", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 26).intern());
            sb.append(e2.getLocalizedMessage());
            n.m2835(strIntern, sb.toString());
        }
        f1325 = (f1324 + 87) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m1624() {
        int i2 = (f1325 + 121) % 128;
        f1324 = i2;
        JSONObject jSONObject = this.f1334;
        int i3 = i2 + 61;
        f1325 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 / 0;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1583(Activity activity, List list) {
        f1325 = (f1324 + 73) % 128;
        boolean zM1591 = m1591(activity, (List<String>) list);
        f1324 = (f1325 + 19) % 128;
        return zM1591;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1603(dn dnVar) {
        byte b2;
        f1325 = (f1324 + 47) % 128;
        String strM1955 = dnVar.m1955();
        switch (strM1955.hashCode()) {
            case -1825565413:
                b2 = !strM1955.equals(m1608("둫麗嬹๓䀏ᘄ喃劉뇔\uf28cꕉ꼹듞\u0a58䑙梼ꘌ฿", TextUtils.getCapsMode("", 0, 0) + 17).intern()) ? (byte) -1 : (byte) 3;
                break;
            case -1655966961:
                b2 = !strM1955.equals(m1608("둫麗嬹๓䀏ᘄ喃劉", 7 - ImageFormat.getBitsPerPixel(0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            case -787751952:
                b2 = !strM1955.equals(m1608("퓆웭熎杊䛡븀", ((byte) KeyEvent.getModifierMetaStateMask()) + 7).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 3619493:
                b2 = !strM1955.equals(m1601("⭮⬘䟩ᢶ乧畂絗홖", ViewConfiguration.getTouchSlop() >> 8).intern()) ? (byte) -1 : (byte) 1;
                break;
            case 1144592183:
                b2 = !strM1955.equals(m1601("語諿\ue61eᝁ⣪풬犵냪䇹᮷➸䯗", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern()) ? (byte) -1 : (byte) 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            m1580(dnVar);
            m1595(m1608("둫麗嬹๓䀏ᘄ喃劉", (ViewConfiguration.getWindowTouchSlop() >> 8) + 8).intern(), dnVar);
            return;
        }
        if (b2 == 1) {
            m1609(dnVar);
            m1595(m1601("⭮⬘䟩ᢶ乧畂絗홖", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern(), dnVar);
            return;
        }
        if (b2 == 2) {
            m1590(dnVar);
            m1595(m1608("퓆웭熎杊䛡븀", 6 - TextUtils.getOffsetAfter("", 0)).intern(), dnVar);
            return;
        }
        if (b2 != 3) {
            if (b2 != 4) {
                return;
            }
            this.f1333 = new jm(m1575(m1602(dnVar.m1957())));
        } else if (this.f1331 == null) {
            int i2 = f1325 + 11;
            f1324 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f1331 = m1585(m1602(dnVar.m1957()));
                ji.m2594().m2597(this.f1331);
            } else {
                this.f1331 = m1585(m1602(dnVar.m1957()));
                ji.m2594().m2597(this.f1331);
                int i3 = 62 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final bg m1620() {
        int i2 = f1324;
        bg bgVar = this.f1339;
        int i3 = i2 + 69;
        f1325 = i3 % 128;
        if (i3 % 2 != 0) {
            return bgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Context m1622() {
        int i2 = f1324 + 27;
        f1325 = i2 % 128;
        if (i2 % 2 == 0) {
            m1618().m1543();
            throw null;
        }
        Context contextM1543 = m1618().m1543();
        f1324 = (f1325 + 45) % 128;
        return contextM1543;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m1627(JSONObject jSONObject) {
        f1325 = (f1324 + 105) % 128;
        this.f1334 = kc.m2756(jSONObject, true);
        int i2 = f1324 + 121;
        f1325 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m1589(JSONObject jSONObject) {
        f1324 = (f1325 + 3) % 128;
        JSONObject jSONObjectM1617 = m1617();
        kc.m2759(jSONObjectM1617, jSONObject);
        f1325 = (f1324 + 43) % 128;
        return jSONObjectM1617;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final cn m1618() {
        int i2 = (f1325 + 125) % 128;
        f1324 = i2;
        cn cnVar = this.f1332;
        f1325 = (i2 + 39) % 128;
        return cnVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dt m1623(String str) {
        int i2 = f1324;
        f1325 = (i2 + 113) % 128;
        if (str != null) {
            return m1626().m2253(str);
        }
        f1325 = (i2 + 101) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final hs m1626() {
        int i2 = f1324;
        hs hsVar = this.f1336;
        f1325 = (i2 + 51) % 128;
        return hsVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1610(JSONObject jSONObject, l lVar, l lVar2, iq iqVar) {
        int i2 = f1324 + 71;
        f1325 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1335.m3018(jSONObject, m1576(lVar, lVar2), m1568(), iqVar);
            throw null;
        }
        this.f1335.m3018(jSONObject, m1576(lVar, lVar2), m1568(), iqVar);
        int i3 = f1324 + 37;
        f1325 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 37 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1619(in inVar) {
        f1324 = (f1325 + 53) % 128;
        this.f1332.m1546().m733(inVar);
        f1324 = (f1325 + 67) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1580(dn dnVar) {
        int i2 = f1325 + 53;
        f1324 = i2 % 128;
        iq iqVar = null;
        if (i2 % 2 == 0) {
            JSONObject jSONObjectM1593 = m1593(dnVar.m1958());
            if (jSONObjectM1593 != null) {
                f1324 = (f1325 + 33) % 128;
                final String strM1953 = dnVar.m1953();
                if (!TextUtils.isEmpty(strM1953)) {
                    int i3 = f1324 + 113;
                    f1325 = i3 % 128;
                    if (i3 % 2 != 0) {
                        final dt dtVarM1623 = m1623(strM1953);
                        if (dtVarM1623 != null) {
                            iqVar = new iq() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.3

                                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                                private static int f1380 = 1;

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static long f1381 = 9123637211593282409L;

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f1382;

                                @Override // com.p004ironsource.adqualitysdk.sdk.i.iq
                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                public final List<WebView> mo1665(Object obj) {
                                    f1382 = (f1380 + 35) % 128;
                                    try {
                                        List<WebView> list = (List) dtVarM1623.m2037(cp.m1605(cp.this), cp.this, Collections.singletonList(obj)).m2043();
                                        int i4 = f1380 + 85;
                                        f1382 = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            return list;
                                        }
                                        throw null;
                                    } catch (Exception unused) {
                                        String strIntern = m1664("\uf109\uf15b\uda3a䤶驶볉廟\ue48b볙ꡞ죾奤樍柮纠ନᦀ㔍댒ﶊ", -TextUtils.lastIndexOf("", '0', 0)).intern();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(m1664("층칰ￆ泝쉍\ue4ed㘒豆菣跰郼ㆨ唉䈘⚞揿⚾Ⴈ\ueb24镐\uf8c7ꕲ맦욼䩶笳俋ࠛᾟ৳ᰪ먡", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                                        sb.append(strM1953);
                                        n.m2835(strIntern, sb.toString());
                                        return null;
                                    }
                                }

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static String m1664(String str, int i4) {
                                    String str2;
                                    Object charArray = str;
                                    if (str != null) {
                                        charArray = str.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (com.p004ironsource.adqualitysdk.sdk.i.f.f1955) {
                                        try {
                                            char[] cArrM2116 = com.p004ironsource.adqualitysdk.sdk.i.f.m2116(f1381, cArr, i4);
                                            com.p004ironsource.adqualitysdk.sdk.i.f.f1954 = 4;
                                            while (true) {
                                                int i5 = com.p004ironsource.adqualitysdk.sdk.i.f.f1954;
                                                if (i5 < cArrM2116.length) {
                                                    int i6 = i5 - 4;
                                                    com.p004ironsource.adqualitysdk.sdk.i.f.f1953 = i6;
                                                    cArrM2116[i5] = (char) (((long) (cArrM2116[i5] ^ cArrM2116[i5 % 4])) ^ (((long) i6) * f1381));
                                                    com.p004ironsource.adqualitysdk.sdk.i.f.f1954 = i5 + 1;
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
                            };
                        } else {
                            String strM1616 = m1616();
                            StringBuilder sb = new StringBuilder();
                            sb.append(m1608("왫\ue208캸\ud9bcঅ譑\ue817똷儁즃㥆菱\udebdꀀ䱬뿊쥉\uf581\udefc溳夫䠫", 21 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
                            sb.append(strM1953);
                            sb.append(m1608("틣\u09c5湷쒢Ჟ믽ࣆ㰕熎杊", (ViewConfiguration.getTapTimeout() >> 16) + 10).intern());
                            cq.m1676(strM1616, sb.toString(), null);
                        }
                    } else {
                        m1623(strM1953);
                        throw null;
                    }
                }
                m1610(jSONObjectM1593, m1606(false), m1606(true), iqVar);
                return;
            }
            return;
        }
        m1593(dnVar.m1958());
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1609(dn dnVar) {
        int i2 = f1325 + 83;
        f1324 = i2 % 128;
        if (i2 % 2 == 0) {
            JSONObject jSONObjectM1593 = m1593(dnVar.m1958());
            if (jSONObjectM1593 != null) {
                String strM1956 = dnVar.m1956();
                t tVarM1600 = m1600(true);
                t tVarM1601 = m1600(false);
                if (TextUtils.isEmpty(strM1956)) {
                    m1604(jSONObjectM1593, tVarM1601, tVarM1600);
                } else {
                    final dt dtVarM1623 = m1623(strM1956);
                    if (dtVarM1623 != null) {
                        m1582(jSONObjectM1593, tVarM1601, tVarM1600, new is() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.7
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.is
                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            public final boolean mo1668(View view) {
                                return dtVarM1623.m2037(cp.m1605(cp.this), cp.this, Collections.singletonList(view)).m2047();
                            }
                        });
                        f1325 = (f1324 + 59) % 128;
                        return;
                    }
                    String strM1616 = m1616();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m1608("왫\ue208캸\ud9bcঅ譑\ue817똷儁즃㥆菱\udebdꀀ䱬뿊쥉\uf581\udefc溳夫䠫", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22).intern());
                    sb.append(strM1956);
                    sb.append(m1608("틣\u09c5湷쒢Ჟ믽ࣆ㰕熎杊", 9 - ImageFormat.getBitsPerPixel(0)).intern());
                    cq.m1676(strM1616, sb.toString(), null);
                    f1324 = (f1325 + 49) % 128;
                    return;
                }
            }
            int i3 = f1325 + 107;
            f1324 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 90 / 0;
                return;
            }
            return;
        }
        m1593(dnVar.m1958());
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1595(String str, dn dnVar) {
        f1324 = (f1325 + 107) % 128;
        JSONObject jSONObjectM1593 = m1593(dnVar.m1958());
        if (jSONObjectM1593 != null) {
            int i2 = f1325 + 125;
            f1324 = i2 % 128;
            if (i2 % 2 == 0 ? jSONObjectM1593.has(m1608("ᬝ堐\uead0뢹㑑ګ∦ᨅ㱘鏶嬹๓弨末ꂟ焳袶坆", 17 - TextUtils.indexOf((CharSequence) "", '0')).intern()) : jSONObjectM1593.has(m1608("ᬝ堐\uead0뢹㑑ګ∦ᨅ㱘鏶嬹๓弨末ꂟ焳袶坆", 115 - TextUtils.indexOf((CharSequence) "", (char) 1)).intern())) {
                jl.b bVarM2623 = jl.b.m2623(jSONObjectM1593.optString(m1608("ᬝ堐\uead0뢹㑑ګ∦ᨅ㱘鏶嬹๓弨末ꂟ焳袶坆", 17 - ImageFormat.getBitsPerPixel(0)).intern(), null));
                String strM1586 = m1586(str, jSONObjectM1593);
                if (bVarM2623 != null) {
                    f1324 = (f1325 + 1) % 128;
                    jl.m2619().m2621(strM1586, bVarM2623);
                }
            }
        }
        int i3 = f1324 + 15;
        f1325 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1590(dn dnVar) {
        int i2 = f1325 + 81;
        f1324 = i2 % 128;
        if (i2 % 2 == 0) {
            JSONObject jSONObjectM1593 = m1593(dnVar.m1958());
            if (jSONObjectM1593 != null) {
                m1598(jSONObjectM1593, m1592(false), m1592(true));
            }
            int i3 = f1324 + 59;
            f1325 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        m1593(dnVar.m1958());
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1586(String str, JSONObject jSONObject) {
        byte b2;
        f1324 = (f1325 + 45) % 128;
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493 && str.equals(m1601("⭮⬘䟩ᢶ乧畂絗홖", TextUtils.indexOf((CharSequence) "", '0') + 1).intern())) {
                    f1325 = (f1324 + 37) % 128;
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(m1608("퓆웭熎杊䛡븀", 6 - (ViewConfiguration.getTouchSlop() >> 8)).intern())) {
                int i2 = f1324 + 69;
                f1325 = i2 % 128;
                b2 = i2 % 2 == 0 ? (byte) 3 : (byte) 2;
            } else {
                b2 = -1;
            }
        } else if (str.equals(m1608("둫麗嬹๓䀏ᘄ喃劉", 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return jSONObject.optString(m1601("楺椛荁撗혗뇧Œ串ꈆ绢呭따＞䯪齍\uf820ࠏჾ", ViewConfiguration.getEdgeSlop() >> 16).intern(), null);
        }
        if (b2 == 1) {
            return jSONObject.optString(m1601("噵嘔羌塃誾䴪㶑ኑ鴘舱梌\ue99c쀄뜭ꎤ꒦㜌\uec3b麺", (-1) - TextUtils.lastIndexOf("", '0')).intern(), null);
        }
        if (b2 != 2) {
            return null;
        }
        return jSONObject.optString(m1608("䀏ᘄ锃\uf7d7⣜熀誖\ud9fbｈ墟\u07bf砈ꘌ฿", 13 - View.MeasureSpec.getMode(0)).intern(), null);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1598(JSONObject jSONObject, u uVar, u uVar2) {
        int i2 = f1324 + 63;
        f1325 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1335.m3015(jSONObject, m1607(uVar, uVar2));
        } else {
            this.f1335.m3015(jSONObject, m1607(uVar, uVar2));
            int i3 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m1599(dn dnVar) {
        List listMo471 = as.m467().mo471();
        ISAdQualityAdType iSAdQualityAdTypeM1954 = dnVar.m1954();
        if (listMo471 == null || iSAdQualityAdTypeM1954 == ISAdQualityAdType.UNKNOWN) {
            return true;
        }
        f1324 = (f1325 + 35) % 128;
        if (listMo471.contains(iSAdQualityAdTypeM1954)) {
            return false;
        }
        f1325 = (f1324 + 111) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1604(JSONObject jSONObject, t tVar, t tVar2) {
        f1325 = (f1324 + 43) % 128;
        this.f1335.m3019(jSONObject, m1577(tVar, tVar2));
        f1324 = (f1325 + 37) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m1602(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = f1324 + 29;
            f1325 = i2 % 128;
            if (i2 % 2 != 0) {
                String next = it.next();
                if (!m1611(next)) {
                    arrayList.add(next);
                    f1324 = (f1325 + 35) % 128;
                } else {
                    String strM1578 = m1578(next);
                    if (strM1578 != null) {
                        arrayList.add(strM1578);
                    }
                }
            } else {
                m1611(it.next());
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1582(JSONObject jSONObject, t tVar, t tVar2, is isVar) {
        int i2 = f1324 + 79;
        f1325 = i2 % 128;
        if (i2 % 2 != 0) {
            this.f1335.m3017(jSONObject, m1577(tVar, tVar2), isVar);
        } else {
            this.f1335.m3017(jSONObject, m1577(tVar, tVar2), isVar);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m1584(JSONObject jSONObject, String str) {
        f1324 = (f1325 + 69) % 128;
        Object objOpt = jSONObject.opt(str);
        try {
            if (!(objOpt instanceof String)) {
                if (!(objOpt instanceof JSONArray)) {
                    return true;
                }
                jSONObject.put(str, new JSONArray((Collection) m1602(kc.m2761((JSONArray) objOpt))));
            } else {
                String str2 = (String) objOpt;
                if (!m1611(str2)) {
                    return true;
                }
                f1325 = (f1324 + 103) % 128;
                String strM1578 = m1578(str2);
                if (strM1578 != null) {
                    jSONObject.put(str, strM1578);
                } else {
                    String strM1616 = m1616();
                    StringBuilder sb = new StringBuilder();
                    sb.append(m1608("⣜熀誖\ud9fb祐꺐", 5 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
                    sb.append(str2);
                    sb.append(m1601("풨품焈䛳熀䎤⌘\ue9b2ᾀ貤瘐ኻ䋖릾뵇忻떐\ue2b3耍袱\uf8fa⾞휾떈⏧壂ᨳﺇ᛫薎愢⮘姵캀둯咍貍奄\ufb42腶", TextUtils.indexOf("", "", 0)).intern());
                    cq.m1678(strM1616, sb.toString());
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m1593(JSONObject jSONObject) {
        dl dlVarM1573;
        f1324 = (f1325 + 49) % 128;
        String strOptString = jSONObject.optString(m1601("咰哚訲䋧ﷰ뢃✳旄鿝瞞爂黆", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        jSONObject.remove(m1601("咰哚訲䋧ﷰ뢃✳旄鿝瞞爂黆", ImageFormat.getBitsPerPixel(0) + 1).intern());
        if (jSONObject.optBoolean(m1608("㥆菱㦰ꀄ\ud836\uf5be\uea22葨", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7).intern()) && (dlVarM1573 = m1573()) != null) {
            f1325 = (f1324 + 77) % 128;
            if (!TextUtils.isEmpty(dlVarM1573.m1948())) {
                jSONObject.remove(m1608("㥆菱㦰ꀄ\ud836\uf5be\uea22葨", 8 - View.MeasureSpec.getSize(0)).intern());
                try {
                    String strIntern = m1608("쓱㜻瞧᜵Ԓ샪㦰ꀄ\ud836\uf5be", 10 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
                    StringBuilder sb = new StringBuilder();
                    sb.append(strOptString);
                    sb.append(dlVarM1573.m1948());
                    jSONObject.put(strIntern, sb.toString());
                } catch (JSONException unused) {
                }
            }
            if (dlVarM1573.m1947()) {
                try {
                    jSONObject.put(m1608("袔踲糲ꬭ믴᳛闩\ud80d\uea22葨", TextUtils.indexOf("", "") + 10).intern(), true);
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i2 = f1324 + 7;
            f1325 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
                if (!m1584(jSONObject, itKeys.next())) {
                    return null;
                }
            } else if (!m1584(jSONObject, itKeys.next())) {
                return null;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m1611(String str) {
        int i2 = f1324 + 117;
        f1325 = i2 % 128;
        return str.endsWith(m1601("鿻鿕磥ኇא䩄睯鷷咀蕜", ExpandableListView.getPackedPositionType(i2 % 2 == 0 ? 1L : 0L)).intern());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private l m1606(final boolean z2) {
        l lVar = new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.11

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1345 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1346 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f1347 = 8809;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f1348;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1349;

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo258(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = f1346 + 115;
                f1345 = i2 % 128;
                int i3 = i2 % 2;
                mo258(jSONObject, webView, activity);
                if (i3 == 0) {
                    throw null;
                }
                f1345 = (f1346 + 81) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* synthetic */ void mo1633(JSONObject jSONObject, WebView webView, Activity activity) {
                f1346 = (f1345 + 119) % 128;
                mo1633(jSONObject, webView, activity);
                int i2 = f1346 + 123;
                f1345 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 44 / 0;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo265(JSONObject jSONObject, WebView webView, Activity activity) {
                f1345 = (f1346 + 21) % 128;
                mo265(jSONObject, webView, activity);
                int i2 = f1346 + 97;
                f1345 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo1638(JSONObject jSONObject, WebView webView, Activity activity) {
                f1345 = (f1346 + 83) % 128;
                mo1638(jSONObject, webView, activity);
                f1345 = (f1346 + 121) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ void mo1642(JSONObject jSONObject, WebView webView, Activity activity) {
                f1346 = (f1345 + 9) % 128;
                mo1642(jSONObject, webView, activity);
                int i2 = f1345 + 11;
                f1346 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1638(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = f1345 + 57;
                f1346 = i2 % 128;
                if (i2 % 2 != 0) {
                    m1628(m1629(Color.rgb(1, 1, 1) * (-1228698065), (char) (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)), "⼊쎎䂷⃒", "垽扔㘖㲵遐硪Ⴙ갡냻㌨踑", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m1628(m1629((-1228698065) - Color.rgb(0, 0, 0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "⼊쎎䂷⃒", "垽扔㘖㲵遐硪Ⴙ갡냻㌨踑", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo265(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = f1345 + 57;
                f1346 = i2 % 128;
                if (i2 % 2 != 0) {
                    m1628(m1629((-1336047436) << (PointF.length(0.0f, 1.0f) > 1.0f ? 1 : (PointF.length(0.0f, 1.0f) == 1.0f ? 0 : -1)), (char) View.MeasureSpec.getSize(0), "뒻嶈ධホ", "㑡₋隂筠꯱뤯鬥ഡ\u0b80嬋贋", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m1628(m1629((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1336047436, (char) View.MeasureSpec.getSize(0), "뒻嶈ධホ", "㑡₋隂筠꯱뤯鬥ഡ\u0b80嬋贋", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final /* synthetic */ void mo1635(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1345 = (f1346 + 59) % 128;
                mo1635(jSONObject, webView, obj, activity);
                f1345 = (f1346 + 25) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ void mo1639(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = f1346 + 53;
                f1345 = i2 % 128;
                int i3 = i2 % 2;
                mo1639(jSONObject, webView, obj, activity);
                if (i3 == 0) {
                    int i4 = 5 / 0;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final /* synthetic */ void mo1643(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i2 = f1345 + 3;
                f1346 = i2 % 128;
                int i3 = i2 % 2;
                mo1643(jSONObject, webView, obj, activity);
                if (i3 != 0) {
                    throw null;
                }
                f1346 = (f1345 + 55) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m1628(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                cp.m1579(cp.this, com.google.firebase.crashlytics.internal.model.a.n(new StringBuilder(), m1629(1690122599 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 58099), "杹봹\uf364ꋢ", "䔶\u18adႻ䰗耲䩘燝ὦ⯶㵊玞捡끴锩쥂𤋮釾\ueb4c⃛", "\u0000\u0000\u0000\u0000"), str), z2, false, Arrays.asList(jSONObject, webView, obj, activity));
                f1345 = (f1346 + 75) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo1643(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1346 = (f1345 + 23) % 128;
                m1628(m1629((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126652813, (char) (46941 - Color.red(0)), "踄貑崇㦷", "\ud8c5䲦붞敜橋맃쥾\uf720\ua62e륀㞀䪴﹜뙘ⴀ", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
                f1345 = (f1346 + 117) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1633(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = f1345 + 87;
                f1346 = i2 % 128;
                if (i2 % 2 != 0) {
                    m1628(m1629(TextUtils.indexOf("", ""), (char) ((byte) KeyEvent.getModifierMetaStateMask()), "ꁣꐧ缷ʦ", "庴\ue1aaᓽᆇ좔Ƴ丌鷵", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m1628(m1629(TextUtils.indexOf("", ""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), "ꁣꐧ缷ʦ", "庴\ue1aaᓽᆇ좔Ƴ丌鷵", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
                f1345 = (f1346 + 1) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo258(JSONObject jSONObject, WebView webView, Activity activity) {
                int i2 = f1345 + 123;
                f1346 = i2 % 128;
                if (i2 % 2 != 0) {
                    m1628(m1629(ViewConfiguration.getFadingEdgeLength() - 124, (char) (59741 >> View.resolveSize(1, 0)), "專푃工맩", "䷥\uf3bf邀枏胖॒坹ﲪ憡뮹⬒臌ᒘﱗ뻗\udb0d", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                } else {
                    m1628(m1629(ViewConfiguration.getFadingEdgeLength() >> 16, (char) (View.resolveSize(0, 0) + 59741), "專푃工맩", "䷥\uf3bf邀枏胖॒坹ﲪ憡뮹⬒臌ᒘﱗ뻗\udb0d", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                }
                f1346 = (f1345 + 27) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1642(JSONObject jSONObject, WebView webView, Activity activity) {
                f1346 = (f1345 + 93) % 128;
                m1628(m1629((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), "㈡蠽漶烔", "\uec8b䉮먌瀠뀅℘權ꨚ㆝蓸鏠\uf8cb", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, null, activity);
                f1346 = (f1345 + 35) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1635(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1345 = (f1346 + 73) % 128;
                m1628(m1629((-1576291188) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.indexOf("", "", 0, 0), "賴ழ\ue9a2\ue2ad", "克࿖㭵Ṉ㓂\uf3ad쿶萮㘪", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
                f1346 = (f1345 + 93) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1639(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1345 = (f1346 + 65) % 128;
                m1628(m1629(ViewConfiguration.getScrollDefaultDelay() >> 16, (char) TextUtils.indexOf("", "", 0), "⊮ᭉ\uf555\ue8be", "楊辂̺廸쥥ᢀᇴ꺊䭀䠅춴龨ᰌ禮\uaaff墲ݯ蔪娚┺", "\u0000\u0000\u0000\u0000").intern(), jSONObject, webView, obj, activity);
                f1346 = (f1345 + 83) % 128;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1629(int i2, char c2, String str, String str2, String str3) {
                String str4;
                Object charArray = str3;
                if (str3 != null) {
                    charArray = str3.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str2;
                if (str2 != null) {
                    charArray2 = str2.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str;
                if (str != null) {
                    charArray3 = str.toCharArray();
                }
                char[] cArr3 = (char[]) charArray3;
                synchronized (com.p004ironsource.adqualitysdk.sdk.i.j.f2569) {
                    try {
                        char[] cArr4 = (char[]) cArr3.clone();
                        char[] cArr5 = (char[]) cArr.clone();
                        cArr4[0] = (char) (c2 ^ cArr4[0]);
                        cArr5[2] = (char) (cArr5[2] + ((char) i2));
                        int length = cArr2.length;
                        char[] cArr6 = new char[length];
                        com.p004ironsource.adqualitysdk.sdk.i.j.f2567 = 0;
                        while (true) {
                            int i3 = com.p004ironsource.adqualitysdk.sdk.i.j.f2567;
                            if (i3 < length) {
                                int i4 = (i3 + 2) % 4;
                                int i5 = (i3 + 3) % 4;
                                int i6 = cArr4[i3 % 4] * 32718;
                                char c3 = cArr5[i4];
                                char c4 = (char) ((i6 + c3) % 65535);
                                com.p004ironsource.adqualitysdk.sdk.i.j.f2568 = c4;
                                cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                                cArr4[i5] = c4;
                                int i7 = com.p004ironsource.adqualitysdk.sdk.i.j.f2567;
                                cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f1348) ^ ((long) f1349)) ^ ((long) f1347));
                                com.p004ironsource.adqualitysdk.sdk.i.j.f2567 = i7 + 1;
                            } else {
                                str4 = new String(cArr6);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str4;
            }
        };
        f1324 = (f1325 + 87) % 128;
        return lVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jf m1585(final List<String> list) {
        jf jfVar = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.9

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1407 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1409;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int[] f1410 = {-1839091908, -1280514251, 1409461631, -1736891650, -24849053, 1618061950, -303040059, 1846180772, -429116926, 2082118441, 2027566915, -145752514, 1476367641, -2060593147, 1802025704, -253270996, 1751524173, -194717286};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1408 = 148;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m1671(final String str, final List<Object> list2) {
                m1672(str, true, list2);
                s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.9.3
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        AnonymousClass9.m1674(AnonymousClass9.this, str, list2);
                    }
                });
                f1409 = (f1407 + 105) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public static /* synthetic */ void m1674(AnonymousClass9 anonymousClass9, String str, List list2) {
                f1409 = (f1407 + 103) % 128;
                anonymousClass9.m1672(str, false, list2);
                int i2 = f1409 + 19;
                f1407 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 30 / 0;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (cp.m1583(activity, list)) {
                    f1409 = (f1407 + 79) % 128;
                    m1673(m1670(new int[]{-80973140, 1688681073, -1937569007, -872291963, -1846443418, 1087948643, -1483697725, 1982416431, -2048370945, -1804537592}, KeyEvent.keyCodeFromString("") + 17).intern(), activity, bundle);
                    f1407 = (f1409 + 29) % 128;
                }
                int i2 = f1409 + 91;
                f1407 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                int i2 = f1407 + 63;
                f1409 = i2 % 128;
                if (i2 % 2 != 0) {
                    cp.m1583(activity, list);
                    throw null;
                }
                if (cp.m1583(activity, list)) {
                    m1675(m1669(4 - Color.blue(0), 19 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 253, "\ufffa\uffd8\u0005\u0006\ufffb￼\u0010\u0006\t\u000b\n￼ￛ\u0010\u000b\u0000\r\u0000\u000b", true).intern(), activity);
                }
                int i3 = f1409 + 35;
                f1407 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (!(!cp.m1583(activity, list))) {
                    int i2 = f1409 + 51;
                    f1407 = i2 % 128;
                    m1675((i2 % 2 == 0 ? m1669(84 >>> (ViewConfiguration.getScrollDefaultDelay() << 105), 88 >>> ExpandableListView.getPackedPositionGroup(0L), 4141 % TextUtils.indexOf("", "", 1, 0), "\uffd9\ufffb\f\u0001\u000e\u0001\f\u0011￨\ufff9\r\u000b�￼\u0007\u0006", true) : m1669(14 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 16, TextUtils.indexOf("", "", 0, 0) + 252, "\uffd9\ufffb\f\u0001\u000e\u0001\f\u0011￨\ufff9\r\u000b�￼\u0007\u0006", false)).intern(), activity);
                    f1407 = (f1409 + 89) % 128;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                int i2 = f1407 + 35;
                f1409 = i2 % 128;
                if (i2 % 2 != 0) {
                    cp.m1583(activity, list);
                    throw null;
                }
                if (cp.m1583(activity, list)) {
                    f1409 = (f1407 + 17) % 128;
                    m1675(m1670(new int[]{-80973140, 1688681073, -1937569007, -872291963, -2096761198, 74634952, 904198289, -248309523, -2048370945, -1804537592}, MotionEvent.axisFromString("") + 18).intern(), activity);
                    f1407 = (f1409 + 75) % 128;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                int i2 = f1409 + 117;
                f1407 = i2 % 128;
                if (i2 % 2 == 0) {
                    cp.m1583(activity, list);
                    throw null;
                }
                if (cp.m1583(activity, list)) {
                    m1673(m1669(5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 27 - TextUtils.getOffsetAfter("", 0), 250 - TextUtils.lastIndexOf("", '0'), "￼ￚ\u0007\b\ufffe\r\ufffa\r￬\ufffe￼\u0007\ufffa\r\f\u0007￢\ufffe\u000f\ufffa￬\u0012\r\u0002\u000f\u0002\r", true).intern(), activity, bundle);
                    f1409 = (f1407 + 67) % 128;
                }
                f1409 = (f1407 + 107) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i2 = f1407 + 69;
                f1409 = i2 % 128;
                if (i2 % 2 != 0) {
                    cp.m1583(activity, list);
                    throw null;
                }
                if (cp.m1583(activity, list)) {
                    m1675(m1669(7 - (ViewConfiguration.getJumpTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, TextUtils.getTrimmedLength("") + 253, "￪\u000b\ufff8\t\u000b￼\ufffb\u0006\u0005\uffd8\ufffa\u000b\u0000\r\u0000\u000b\u0010", false).intern(), activity);
                }
                f1409 = (f1407 + 67) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                f1407 = (f1409 + 101) % 128;
                if (!(!cp.m1583(activity, list))) {
                    m1675(m1669(Color.red(0) + 11, 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 301 - AndroidCharacter.getMirror('0'), "\r\u0000\u000b\u0010￪\u000b\u0006\u0007\u0007￼\ufffb\u0006\u0005\uffd8\ufffa\u000b\u0000", false).intern(), activity);
                }
                int i2 = f1407 + 117;
                f1409 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 80 / 0;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, com.p004ironsource.adqualitysdk.sdk.i.jh
            /* JADX INFO: renamed from: ﻛ */
            public final void mo394(Activity activity) {
                f1409 = (f1407 + 55) % 128;
                m1675(m1670(new int[]{-963949411, -1879449177, -627434334, -990181936, -753425393, 1587301696, -1303884069, 1501950017, 1135526252, -73105071, -897612722, -959070606, -2048370945, -1804537592}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25).intern(), activity);
                int i2 = f1407 + 115;
                f1409 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, com.p004ironsource.adqualitysdk.sdk.i.jh
            /* JADX INFO: renamed from: ｋ */
            public final void mo395(Activity activity) {
                f1409 = (f1407 + 115) % 128;
                m1675(m1670(new int[]{-963949411, -1879449177, -28197108, 821160712, 816740549, 1982705414, 736819955, -1229756157, -897612722, -959070606, -2048370945, -1804537592}, 20 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), activity);
                f1407 = (f1409 + 29) % 128;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private void m1673(String str, Activity activity, Bundle bundle) {
                List<Object> listAsList;
                int i2 = f1409 + 15;
                f1407 = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = new Object[3];
                    objArr[1] = activity;
                    objArr[0] = bundle;
                    listAsList = Arrays.asList(objArr);
                } else {
                    listAsList = Arrays.asList(activity, bundle);
                }
                m1671(str, listAsList);
                int i3 = f1409 + 91;
                f1407 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 81 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1675(String str, Activity activity) {
                f1407 = (f1409 + 25) % 128;
                m1671(str, Collections.singletonList(activity));
                int i2 = f1409 + 89;
                f1407 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m1672(String str, boolean z2, List<Object> list2) {
                cp.m1579(cp.this, com.google.firebase.crashlytics.internal.model.a.n(new StringBuilder(), m1670(new int[]{674088814, 577980149, -55334248, 803399389, 565380066, -966354421, 982537540, -890297457, 279687512, -794981157}, (Process.myPid() >> 22) + 18), str), z2, false, list2);
                f1409 = (f1407 + 41) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m1670(int[] iArr, int i2) {
                String str;
                synchronized (com.p004ironsource.adqualitysdk.sdk.i.d.f1586) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f1410.clone();
                        com.p004ironsource.adqualitysdk.sdk.i.d.f1584 = 0;
                        while (true) {
                            int i3 = com.p004ironsource.adqualitysdk.sdk.i.d.f1584;
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
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = (c2 << 16) + c3;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = (c4 << 16) + c5;
                                com.p004ironsource.adqualitysdk.sdk.i.d.m1788(iArr2);
                                for (int i5 = 0; i5 < 16; i5++) {
                                    int i6 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587 ^ iArr2[i5];
                                    com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i6;
                                    int iM1787 = com.p004ironsource.adqualitysdk.sdk.i.d.m1787(i6) ^ com.p004ironsource.adqualitysdk.sdk.i.d.f1585;
                                    int i7 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587;
                                    com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = iM1787;
                                    com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i7;
                                }
                                int i8 = com.p004ironsource.adqualitysdk.sdk.i.d.f1587;
                                int i9 = com.p004ironsource.adqualitysdk.sdk.i.d.f1585;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i9;
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i8;
                                int i10 = i8 ^ iArr2[16];
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1585 = i10;
                                int i11 = i9 ^ iArr2[17];
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1587 = i11;
                                cArr[0] = (char) (i11 >>> 16);
                                cArr[1] = (char) i11;
                                cArr[2] = (char) (i10 >>> 16);
                                cArr[3] = (char) i10;
                                com.p004ironsource.adqualitysdk.sdk.i.d.m1788(iArr2);
                                int i12 = com.p004ironsource.adqualitysdk.sdk.i.d.f1584;
                                cArr2[i12 << 1] = cArr[0];
                                cArr2[(i12 << 1) + 1] = cArr[1];
                                cArr2[(i12 << 1) + 2] = cArr[2];
                                cArr2[(i12 << 1) + 3] = cArr[3];
                                com.p004ironsource.adqualitysdk.sdk.i.d.f1584 = i12 + 2;
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

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m1669(int i2, int i3, int i4, String str, boolean z2) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (com.p004ironsource.adqualitysdk.sdk.i.b.f672) {
                    try {
                        char[] cArr2 = new char[i3];
                        com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                        while (true) {
                            int i5 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                            if (i5 >= i3) {
                                break;
                            }
                            com.p004ironsource.adqualitysdk.sdk.i.b.f671 = cArr[i5];
                            cArr2[com.p004ironsource.adqualitysdk.sdk.i.b.f673] = (char) (com.p004ironsource.adqualitysdk.sdk.i.b.f671 + i4);
                            int i6 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                            cArr2[i6] = (char) (cArr2[i6] - f1408);
                            com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i6 + 1;
                        }
                        if (i2 > 0) {
                            com.p004ironsource.adqualitysdk.sdk.i.b.f674 = i2;
                            char[] cArr3 = new char[i3];
                            System.arraycopy(cArr2, 0, cArr3, 0, i3);
                            int i7 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                            System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                            int i8 = com.p004ironsource.adqualitysdk.sdk.i.b.f674;
                            System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                        }
                        if (z2) {
                            char[] cArr4 = new char[i3];
                            com.p004ironsource.adqualitysdk.sdk.i.b.f673 = 0;
                            while (true) {
                                int i9 = com.p004ironsource.adqualitysdk.sdk.i.b.f673;
                                if (i9 >= i3) {
                                    break;
                                }
                                cArr4[i9] = cArr2[(i3 - i9) - 1];
                                com.p004ironsource.adqualitysdk.sdk.i.b.f673 = i9 + 1;
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
        };
        f1325 = (f1324 + 31) % 128;
        return jfVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private u m1607(final u uVar, final u uVar2) {
        int i2 = f1325 + 95;
        f1324 = i2 % 128;
        if (i2 % 2 == 0) {
            if (uVar == null) {
                uVar = new u();
                f1324 = (f1325 + 39) % 128;
            }
            if (uVar2 == null) {
                uVar2 = new u();
            }
            u uVar3 = new u() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ﻐ */
                public final void mo1638(JSONObject jSONObject, WebView webView, View view) {
                    uVar2.mo1638(jSONObject, webView, view);
                    s.m2917(new f.AnonymousClass1(uVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ﻛ */
                public final void mo265(JSONObject jSONObject, WebView webView, View view) {
                    uVar2.mo265(jSONObject, webView, view);
                    s.m2917(new e.AnonymousClass5(uVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ｋ */
                public final void mo1642(JSONObject jSONObject, WebView webView, View view) {
                    uVar2.mo1642(jSONObject, webView, view);
                    s.m2917(new g.AnonymousClass5(uVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ﾇ */
                public final void mo1633(JSONObject jSONObject, WebView webView, View view) {
                    uVar2.mo1633(jSONObject, webView, view);
                    s.m2917(new a.AnonymousClass1(uVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ﾒ */
                public final void mo258(JSONObject jSONObject, WebView webView, View view) {
                    uVar2.mo258(jSONObject, webView, view);
                    s.m2917(new b.AnonymousClass3(uVar, jSONObject, webView, view));
                }

                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ﻛ */
                public final void mo1635(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    uVar2.mo1635(jSONObject, webView, obj, view);
                    s.m2917(new d.AnonymousClass3(uVar, jSONObject, webView, obj, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ﾇ */
                public final void mo1639(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    uVar2.mo1639(jSONObject, webView, obj, view);
                    s.m2917(new j.AnonymousClass3(uVar, jSONObject, webView, obj, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
                /* JADX INFO: renamed from: ﾒ */
                public final void mo1643(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    uVar2.mo1643(jSONObject, webView, obj, view);
                    s.m2917(new c.AnonymousClass3(uVar, jSONObject, webView, obj, view));
                }
            };
            f1324 = (f1325 + 59) % 128;
            return uVar3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m1591(Activity activity, List<String> list) {
        int i2 = f1325 + 15;
        f1324 = i2 % 128;
        if (i2 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty() || list.contains(activity.getClass().getName())) {
            f1324 = (f1325 + 91) % 128;
            return true;
        }
        int i3 = f1324 + 19;
        f1325 = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private JSONObject m1587(Activity activity, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ik.f2471, m1618().m1557());
            jSONObject.put(ik.f2426, m1618().m1552());
            jSONObject.put(ik.f2424, m1618().m1550());
            jSONObject.put(m1608("둫麗榾鲣\u07bf砈ꘌ฿", 7 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), activity.getClass().getName());
            if (bundle != null) {
                int i2 = f1324 + 69;
                f1325 = i2 % 128;
                jSONObject.put((i2 % 2 == 0 ? m1601("嬳孒쎌檺泵\uf12dཊ\uf4e0遏㸧婂\u0fde", Color.green(0)) : m1601("嬳孒쎌檺泵\uf12dཊ\uf4e0遏㸧婂\u0fde", Color.green(0))).intern(), true);
            }
            return jSONObject;
        } catch (JSONException unused) {
            n.m2835(m1601("ႀგ鶃䤄紕꼤Ⳮ\ue53c\udbfc怬秉ḿ蛜唸닣匷燽ื追萹", KeyEvent.getMaxKeyCode() >> 16).intern(), m1608("䷎ᚮ\uf8a2駎夫䠫ꂈ먲珳뭺嬹๓僭䁓麌쇎\ud836\uf5beᔕ겗䂖忌쥉\uf581\uf059勃㦰ꀄ\ud836\uf5be", 30 - KeyEvent.keyCodeFromString("")).intern());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1608(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2870) {
            try {
                char[] cArr2 = new char[cArr.length];
                m.f2869 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i3 = m.f2869;
                    if (i3 < cArr.length) {
                        cArr3[0] = cArr[i3];
                        cArr3[1] = cArr[i3 + 1];
                        int i4 = 58224;
                        for (int i5 = 0; i5 < 16; i5++) {
                            char c2 = cArr3[1];
                            char c3 = cArr3[0];
                            char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f1328)) ^ ((c3 >>> 5) + f1326)));
                            cArr3[1] = c4;
                            cArr3[0] = (char) (c3 - (((c4 >>> 5) + f1330) ^ ((c4 + i4) ^ ((c4 << 4) + f1327))));
                            i4 -= 40503;
                        }
                        int i6 = m.f2869;
                        cArr2[i6] = cArr3[0];
                        cArr2[i6 + 1] = cArr3[1];
                        m.f2869 = i6 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private t m1600(final boolean z2) {
        t tVar = new t() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.15

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static boolean f1364 = true;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1365 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1366 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1367 = 132;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static boolean f1368 = true;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1369 = {229, 232, 200, 237, 247, 244, 240, 253, 233, 201, 252, 248, 246, 199, 231, 239, 202, 243, 241, 206, 250, 251, 197, 236, 230, 242, 249, 218, 208, 178};

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo258(JSONObject jSONObject, View view, Activity activity) {
                int i2 = f1365 + 27;
                f1366 = i2 % 128;
                int i3 = i2 % 2;
                mo258(jSONObject, view, activity);
                if (i3 != 0) {
                    int i4 = 0 / 0;
                }
                int i5 = f1366 + 27;
                f1365 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo1633(JSONObject jSONObject, View view, Activity activity) {
                f1365 = (f1366 + 101) % 128;
                mo1633(jSONObject, view, activity);
                f1366 = (f1365 + 65) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo265(JSONObject jSONObject, View view, Activity activity) {
                int i2 = f1365 + 123;
                f1366 = i2 % 128;
                int i3 = i2 % 2;
                mo265(jSONObject, view, activity);
                if (i3 != 0) {
                    int i4 = 12 / 0;
                }
                int i5 = f1365 + 27;
                f1366 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 14 / 0;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1638(JSONObject jSONObject, View view, Activity activity) {
                f1365 = (f1366 + 99) % 128;
                mo1638(jSONObject, view, activity);
                f1366 = (f1365 + 57) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo1642(JSONObject jSONObject, View view, Activity activity) {
                f1365 = (f1366 + 123) % 128;
                mo1642(jSONObject, view, activity);
                int i2 = f1366 + 77;
                f1365 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1642(JSONObject jSONObject, View view, Activity activity) {
                int i2 = f1366 + 57;
                f1365 = i2 % 128;
                if (i2 % 2 == 0) {
                    m1655(m1654((String) null, (int[]) null, 97 % (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0082\u0089\u0098\u008f\u0081\u008c\u008c\u0097\u0096\u0089\u0084\u0095").intern(), jSONObject, view, null, activity);
                } else {
                    m1655(m1654((String) null, (int[]) null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0082\u0089\u0098\u008f\u0081\u008c\u008c\u0097\u0096\u0089\u0084\u0095").intern(), jSONObject, view, null, activity);
                }
                f1365 = (f1366 + 47) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo265(JSONObject jSONObject, View view, Activity activity) {
                f1365 = (f1366 + 27) % 128;
                m1655(m1654((String) null, (int[]) null, 127 - KeyEvent.keyCodeFromString(""), "\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, view, null, activity);
                int i2 = f1366 + 85;
                f1365 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo1635(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1366 = (f1365 + 91) % 128;
                mo1635(jSONObject, view, obj, activity);
                int i2 = f1365 + 111;
                f1366 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo1639(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = f1365 + 113;
                f1366 = i2 % 128;
                int i3 = i2 % 2;
                mo1639(jSONObject, view, obj, activity);
                if (i3 != 0) {
                    throw null;
                }
                f1365 = (f1366 + 95) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo1643(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i2 = f1365 + 25;
                f1366 = i2 % 128;
                int i3 = i2 % 2;
                mo1643(jSONObject, view, obj, activity);
                if (i3 != 0) {
                    int i4 = 66 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1635(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1366 = (f1365 + 23) % 128;
                m1655(m1654((String) null, (int[]) null, Process.getGidForName("") + 128, "\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, view, obj, activity);
                f1366 = (f1365 + 29) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo258(JSONObject jSONObject, View view, Activity activity) {
                f1365 = (f1366 + 35) % 128;
                m1655(m1654((String) null, (int[]) null, 126 - ImageFormat.getBitsPerPixel(0), "\u0081\u008d\u008c\u008b\u008a\u0082\u0089\u0088\u0081\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject, view, null, activity);
                f1366 = (f1365 + 115) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1643(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1366 = (f1365 + 87) % 128;
                m1655(m1654((String) null, (int[]) null, TextUtils.indexOf("", "", 0) + 127, "\u0085\u0094\u0093\u0092\u008d\u0091\u0082\u0089\u0090\u008f\u0084\u0087\u008e\u0082\u0081").intern(), jSONObject, view, obj, activity);
                f1365 = (f1366 + 45) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1633(JSONObject jSONObject, View view, Activity activity) {
                f1365 = (f1366 + 57) % 128;
                m1655(m1654((String) null, (int[]) null, View.MeasureSpec.getSize(0) + 127, "\u0082\u0089\u0085\u0092\u0087\u008e\u0082\u0081").intern(), jSONObject, view, null, activity);
                f1366 = (f1365 + 45) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1639(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1365 = (f1366 + 101) % 128;
                m1655(m1654((String) null, (int[]) null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), "\u008c\u009a\u0089\u0095\u008a\u008c\u009a\u0089\u0084\u0087\u008e\u0089\u0093\u0092\u008d\u0098\u008e\u0099\u0089\u0096").intern(), jSONObject, view, obj, activity);
                int i2 = f1366 + 87;
                f1365 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1638(JSONObject jSONObject, View view, Activity activity) {
                int i2 = f1366 + 97;
                f1365 = i2 % 128;
                if (i2 % 2 == 0) {
                    m1655(m1654((String) null, (int[]) null, (ViewConfiguration.getTapTimeout() >> 41) + 15, "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, view, null, activity);
                } else {
                    m1655(m1654((String) null, (int[]) null, 127 - (ViewConfiguration.getTapTimeout() >> 16), "\u008c\u009a\u0089\u0095\u008a\u0093\u0092\u008c\u0085\u009b\u008f").intern(), jSONObject, view, null, activity);
                }
                f1366 = (f1365 + 121) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1655(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                cp.m1579(cp.this, com.google.firebase.crashlytics.internal.model.a.n(new StringBuilder(), m1654((String) null, (int[]) null, 127 - Gravity.getAbsoluteGravity(0, 0), "\u009e\u008d\u0089\u009a\u0089\u008c\u0085\u0084\u009d\u0082\u0097\u0096\u0089\u0084\u009c"), str), z2, false, Arrays.asList(jSONObject, view, obj, activity));
                f1365 = (f1366 + 81) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m1654(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes(CharEncoding.ISO_8859_1);
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (o.f2877) {
                    try {
                        char[] cArr2 = f1369;
                        int i3 = f1367;
                        if (f1364) {
                            int length = bArr.length;
                            o.f2878 = length;
                            char[] cArr3 = new char[length];
                            o.f2879 = 0;
                            while (o.f2879 < o.f2878) {
                                int i4 = o.f2879;
                                int i5 = o.f2878 - 1;
                                int i6 = o.f2879;
                                cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                                o.f2879 = i6 + 1;
                            }
                            return new String(cArr3);
                        }
                        if (f1368) {
                            int length2 = cArr.length;
                            o.f2878 = length2;
                            char[] cArr4 = new char[length2];
                            o.f2879 = 0;
                            while (o.f2879 < o.f2878) {
                                int i7 = o.f2879;
                                int i8 = o.f2878 - 1;
                                int i9 = o.f2879;
                                cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                                o.f2879 = i9 + 1;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        o.f2878 = length3;
                        char[] cArr5 = new char[length3];
                        o.f2879 = 0;
                        while (o.f2879 < o.f2878) {
                            int i10 = o.f2879;
                            int i11 = o.f2878 - 1;
                            int i12 = o.f2879;
                            cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                            o.f2879 = i12 + 1;
                        }
                        return new String(cArr5);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        f1325 = (f1324 + 41) % 128;
        return tVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m1625(String str, JSONObject jSONObject) {
        f1325 = (f1324 + 89) % 128;
        if (!str.equals(m1601("퐓푲쾿鞁윹ﴙ\uf25a弛ὲ㈆Ᵹꐛ䉢ܔ汰\ue90b", '0' - AndroidCharacter.getMirror('0')).intern())) {
            if (str.equals(m1608("吷厩쐎쯋㪓쁚跹넋\ud9f8ॄ", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 10).intern())) {
                f1325 = (f1324 + 65) % 128;
                this.f1332.m1546().m738(jSONObject);
            }
        } else {
            int i2 = f1325 + 67;
            f1324 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f1332.m1546().m732(jSONObject);
                throw null;
            }
            this.f1332.m1546().m732(jSONObject);
        }
        JSONObject jSONObjectM2767 = kc.m2767(m1589(jSONObject));
        if (str.equals(ik.f2431)) {
            f1325 = (f1324 + 19) % 128;
            this.f1332.m1546().m734(jSONObjectM2767);
            return;
        }
        if (!str.equals(ik.f2430)) {
            if (!str.equals(ik.f2435)) {
                if (str.equals(ik.f2436)) {
                    this.f1332.m1546().m728(jSONObjectM2767);
                    return;
                }
                if (str.equals(ik.f2433)) {
                    this.f1332.m1546().m729(jSONObjectM2767);
                    return;
                }
                if (!str.equals(ik.f2429)) {
                    if (str.equals(ik.f2432)) {
                        this.f1332.m1546().m727(jSONObjectM2767);
                        return;
                    } else {
                        this.f1332.m1546().m737(str, jSONObject);
                        return;
                    }
                }
                f1325 = (f1324 + 111) % 128;
                this.f1332.m1546().m730(jSONObjectM2767);
                return;
            }
            int i3 = f1324 + 21;
            f1325 = i3 % 128;
            if (i3 % 2 != 0) {
                this.f1332.m1546().m740(jSONObjectM2767);
                return;
            } else {
                this.f1332.m1546().m740(jSONObjectM2767);
                throw null;
            }
        }
        this.f1332.m1546().m731(jSONObjectM2767);
        int i4 = f1324 + 117;
        f1325 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1621(String str, List<Object> list) {
        m1596(com.google.firebase.crashlytics.internal.model.a.n(new StringBuilder(), m1608("䘻뢭\u177a⾼駃깿Ꝫ鉤졲窫聴ꯨ誖\ud9fb룻腖", 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), str), list);
        f1324 = (f1325 + 87) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1578(String str) {
        Class clsM789;
        int i2 = f1325 + 47;
        f1324 = i2 % 128;
        if (i2 % 2 == 0 ? (clsM789 = m1620().m789(kd.m2778(str, m1601("鿻鿕磥ኇא䩄睯鷷咀蕜", TextUtils.lastIndexOf("", '0', 0) + 1).intern()))) != null : (clsM789 = m1620().m789(kd.m2778(str, m1601("鿻鿕磥ኇא䩄睯鷷咀蕜", 0 - TextUtils.lastIndexOf("", (char) 17, 1)).intern()))) != null) {
            String name = clsM789.getName();
            f1325 = (f1324 + 17) % 128;
            return name;
        }
        f1325 = (f1324 + 69) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private u m1592(final boolean z2) {
        u uVar = new u() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.13

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1355 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1358;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f1357 = {39316, 51678, 14639, 26993, 55482, 2062, 30787, 43965, 7156, 19287, 47751, 50622, 38388, 25861, 13659, 33936, 21540, 9321, 63383, 18398, 6013, 59053, 46847, 1555, 53672, 41471, 28959, 59994, 47632, 19174, 6842, 43886, 31699, 2954, 55415, 26663, 'a', 20523, 41181, 61569, 16725, 37352, 57777, 12876, 33308, 53889, 9060, 29450, 50137, 5193, 25633, 61976, 41554, 21156, 760, 45866, 25473, 5062, 49204, 'v', 20518, 41211, 61594, 16765, 37375, 57774, 12872, 33307, 53935, 9075, 29441, 'w', 20522, 41212, 61614, 16724, 37369, 57781, 12868, 33309, 53892, 9082, 29452, 50129, 5229, 25638, 46308, 1158, 21850, 42464, 62889, 43440, 63977, 2366, 22858, 59520, 14389, 18508, 39820, 11214, 31610, 35505, 'W', 20518, 41200, 61577, 16723, 37372, 57755, 12877, 33332, 53934, 9061, 29457, 50129, 5229, 25655, 46291, 1246};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f1356 = 1020903997458632783L;

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo258(JSONObject jSONObject, WebView webView, View view) {
                f1358 = (f1355 + 19) % 128;
                mo258(jSONObject, webView, view);
                f1355 = (f1358 + 107) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo1633(JSONObject jSONObject, WebView webView, View view) {
                f1358 = (f1355 + 25) % 128;
                mo1633(jSONObject, webView, view);
                int i2 = f1358 + 59;
                f1355 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo265(JSONObject jSONObject, WebView webView, View view) {
                f1358 = (f1355 + 25) % 128;
                mo265(jSONObject, webView, view);
                f1358 = (f1355 + 37) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo1638(JSONObject jSONObject, WebView webView, View view) {
                int i2 = f1358 + 91;
                f1355 = i2 % 128;
                int i3 = i2 % 2;
                mo1638(jSONObject, webView, view);
                if (i3 == 0) {
                    throw null;
                }
                int i4 = f1355 + 57;
                f1358 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 72 / 0;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo1642(JSONObject jSONObject, WebView webView, View view) {
                f1358 = (f1355 + 23) % 128;
                mo1642(jSONObject, webView, view);
                int i2 = f1355 + 87;
                f1358 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo1638(JSONObject jSONObject, WebView webView, View view) {
                int i2 = f1355 + 85;
                f1358 = i2 % 128;
                if (i2 % 2 != 0) {
                    m1644(m1645(MotionEvent.axisFromString("") + 119, 116 / (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (43475 >>> (PointF.length(1.0f, 0.0f) > 2.0f ? 1 : (PointF.length(1.0f, 0.0f) == 2.0f ? 0 : -1)))).intern(), jSONObject, webView, null, view);
                } else {
                    m1644(m1645(10 - MotionEvent.axisFromString(""), 92 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43475)).intern(), jSONObject, webView, null, view);
                }
                f1355 = (f1358 + 119) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo265(JSONObject jSONObject, WebView webView, View view) {
                f1358 = (f1355 + 67) % 128;
                m1644(m1645(11 - ((Process.getThreadPriority(0) + 20) >> 6), KeyEvent.normalizeMetaState(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 39413)).intern(), jSONObject, webView, null, view);
                int i2 = f1358 + 57;
                f1355 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 / 0;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo1635(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = f1355 + 57;
                f1358 = i2 % 128;
                int i3 = i2 % 2;
                mo1635(jSONObject, webView, obj, view);
                if (i3 != 0) {
                    int i4 = 47 / 0;
                }
                f1355 = (f1358 + 55) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo1639(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = f1355 + 85;
                f1358 = i2 % 128;
                int i3 = i2 % 2;
                mo1639(jSONObject, webView, obj, view);
                if (i3 != 0) {
                    throw null;
                }
                f1355 = (f1358 + 67) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo1643(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1355 = (f1358 + 49) % 128;
                mo1643(jSONObject, webView, obj, view);
                f1358 = (f1355 + 81) % 128;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m1644(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                cp.m1579(cp.this, com.google.firebase.crashlytics.internal.model.a.n(new StringBuilder(), m1645(16 - TextUtils.indexOf((CharSequence) "", '0'), 102 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), str), z2, false, Arrays.asList(jSONObject, webView, obj, view));
                f1358 = (f1355 + 45) % 128;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo1635(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = f1358 + 3;
                f1355 = i2 % 128;
                if (i2 % 2 == 0) {
                    m1644(m1645(ViewConfiguration.getMinimumFlingVelocity() * 330, 90 >>> KeyEvent.keyCodeFromString(""), (char) (59963 / (ViewConfiguration.getFadingEdgeLength() - 107))).intern(), jSONObject, webView, obj, view);
                } else {
                    m1644(m1645((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9, 27 - KeyEvent.keyCodeFromString(""), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59963)).intern(), jSONObject, webView, obj, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1642(JSONObject jSONObject, WebView webView, View view) {
                f1355 = (f1358 + 35) % 128;
                m1644(m1645(Color.blue(0) + 12, (Process.myTid() >> 22) + 59, (char) ExpandableListView.getPackedPositionType(0L)).intern(), jSONObject, webView, null, view);
                int i2 = f1358 + 75;
                f1355 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 82 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1633(JSONObject jSONObject, WebView webView, View view) {
                f1358 = (f1355 + 97) % 128;
                m1644(m1645(8 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 51 - View.MeasureSpec.getSize(0), (char) (View.resolveSizeAndState(0, 0, 0) + 62073)).intern(), jSONObject, webView, null, view);
                int i2 = f1358 + 27;
                f1355 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 80 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo258(JSONObject jSONObject, WebView webView, View view) {
                f1358 = (f1355 + 125) % 128;
                m1644(m1645(16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (50655 - (KeyEvent.getMaxKeyCode() >> 16))).intern(), jSONObject, webView, null, view);
                f1355 = (f1358 + 103) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo1639(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i2 = f1355 + 101;
                f1358 = i2 % 128;
                if (i2 % 2 != 0) {
                    m1644(m1645(51 / KeyEvent.getDeadChar(1, 1), 84 >>> TextUtils.indexOf("", "", 1), (char) TextUtils.indexOf("", "", 0, 1)).intern(), jSONObject, webView, obj, view);
                } else {
                    m1644(m1645(KeyEvent.getDeadChar(0, 0) + 20, 71 - TextUtils.indexOf("", "", 0), (char) TextUtils.indexOf("", "", 0, 0)).intern(), jSONObject, webView, obj, view);
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.u
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo1643(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1355 = (f1358 + 17) % 128;
                m1644(m1645(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 36, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), jSONObject, webView, obj, view);
                int i2 = f1355 + 77;
                f1358 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 25 / 0;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1645(int i2, int i3, char c2) {
                String str;
                synchronized (com.p004ironsource.adqualitysdk.sdk.i.a.f68) {
                    try {
                        char[] cArr = new char[i2];
                        com.p004ironsource.adqualitysdk.sdk.i.a.f69 = 0;
                        while (true) {
                            int i4 = com.p004ironsource.adqualitysdk.sdk.i.a.f69;
                            if (i4 < i2) {
                                cArr[i4] = (char) ((((long) f1357[i3 + i4]) ^ (((long) i4) * f1356)) ^ ((long) c2));
                                com.p004ironsource.adqualitysdk.sdk.i.a.f69 = i4 + 1;
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
        };
        int i2 = f1324 + 81;
        f1325 = i2 % 128;
        if (i2 % 2 != 0) {
            return uVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1596(final String str, final List<Object> list) {
        s.m2917(new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.4
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cp.m1579(cp.this, str, false, false, list);
            }
        });
        s.m2922(new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.10
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cp.m1579(cp.this, str, true, false, list);
            }
        });
        m1581(new io() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.6
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cp.m1579(cp.this, str, false, true, list);
            }
        }, true);
        f1324 = (f1325 + 7) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private l m1576(final l lVar, final l lVar2) {
        f1325 = (f1324 + 63) % 128;
        if (lVar == null) {
            lVar = new l();
            f1324 = (f1325 + 51) % 128;
        }
        if (lVar2 == null) {
            lVar2 = new l();
        }
        return new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final void mo1638(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo1638(jSONObject, webView, activity);
                s.m2917(new f.AnonymousClass1(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo265(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo265(jSONObject, webView, activity);
                s.m2917(new e.AnonymousClass5(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final void mo1633(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo1633(jSONObject, webView, activity);
                s.m2917(new a.AnonymousClass1(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo258(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo258(jSONObject, webView, activity);
                s.m2917(new b.AnonymousClass3(lVar, jSONObject, webView, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1642(JSONObject jSONObject, WebView webView, Activity activity) {
                lVar2.mo1642(jSONObject, webView, activity);
                s.m2917(new g.AnonymousClass5(lVar, jSONObject, webView, activity));
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo1643(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo1643(jSONObject, webView, obj, activity);
                s.m2917(new c.AnonymousClass3(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1635(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo1635(jSONObject, webView, obj, activity);
                s.m2917(new d.AnonymousClass3(lVar, jSONObject, webView, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.l, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1639(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                lVar2.mo1639(jSONObject, webView, obj, activity);
                s.m2917(new j.AnonymousClass3(lVar, jSONObject, webView, obj, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1597(String str, boolean z2, boolean z3, List<Object> list) {
        try {
            Cdo cdoM2255 = this.f1336.m2255(str);
            if (cdoM2255 != null) {
                dt dtVarM2253 = this.f1336.m2253(cdoM2255.m1962());
                if (dtVarM2253 != null) {
                    if (z2 == cdoM2255.m1960() && z3 == cdoM2255.m1961()) {
                        f1324 = (f1325 + 29) % 128;
                        if (r.m2874().m2907()) {
                            cq.m1678(m1616(), str);
                        }
                        dtVarM2253.m2037(this.f1340, this, list);
                        return;
                    }
                    return;
                }
                String strM1616 = m1616();
                StringBuilder sb = new StringBuilder();
                sb.append(m1608("왫\ue208캸\ud9bcঅ譑\ue817똷儁즃㥆菱\udebdꀀ䱬뿊쥉\uf581\udefc溳夫䠫", 21 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
                sb.append(cdoM2255.m1962());
                sb.append(m1608("틣\u09c5湷쒢Ჟ믽ࣆ㰕熎杊", 9 - Process.getGidForName("")).intern());
                cq.m1676(strM1616, sb.toString(), null);
                f1325 = (f1324 + 103) % 128;
            }
        } catch (Throwable th) {
            String strM1617 = m1616();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1608("䷎ᚮ\uf8a2駎夫䠫䂾裏熎杊쒶誾僭䁓ꨚ䐆栵㴘簌櫵ٶ㹗", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20).intern());
            sb2.append(str);
            cq.m1676(strM1617, sb2.toString(), th);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private t m1577(final t tVar, final t tVar2) {
        f1324 = (f1325 + 31) % 128;
        if (tVar == null) {
            tVar = new t();
        }
        if (tVar2 == null) {
            tVar2 = new t();
            f1325 = (f1324 + 37) % 128;
        }
        return new t() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻐ */
            public final void mo1642(JSONObject jSONObject, View view, Activity activity) {
                tVar2.mo1642(jSONObject, view, activity);
                s.m2917(new g.AnonymousClass5(tVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﻛ */
            public final void mo265(JSONObject jSONObject, View view, Activity activity) {
                tVar2.mo265(jSONObject, view, activity);
                s.m2917(new e.AnonymousClass5(tVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final void mo1635(JSONObject jSONObject, View view, Object obj, Activity activity) {
                tVar2.mo1635(jSONObject, view, obj, activity);
                s.m2917(new d.AnonymousClass3(tVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo258(JSONObject jSONObject, View view, Activity activity) {
                tVar2.mo258(jSONObject, view, activity);
                s.m2917(new b.AnonymousClass3(tVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1643(JSONObject jSONObject, View view, Object obj, Activity activity) {
                tVar2.mo1643(jSONObject, view, obj, activity);
                s.m2917(new c.AnonymousClass3(tVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ｋ */
            public final void mo1633(JSONObject jSONObject, View view, Activity activity) {
                tVar2.mo1633(jSONObject, view, activity);
                s.m2917(new a.AnonymousClass1(tVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾇ */
            public final void mo1639(JSONObject jSONObject, View view, Object obj, Activity activity) {
                tVar2.mo1639(jSONObject, view, obj, activity);
                s.m2917(new j.AnonymousClass3(tVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.p004ironsource.adqualitysdk.sdk.i.t, com.p004ironsource.adqualitysdk.sdk.i.p
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1638(JSONObject jSONObject, View view, Activity activity) {
                tVar2.mo1638(jSONObject, view, activity);
                s.m2917(new f.AnonymousClass1(tVar, jSONObject, view, activity));
            }
        };
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private jo m1575(final List<String> list) {
        jo joVar = new jo() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.5

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static short[] f1389 = null;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static byte[] f1390 = {-107, -78, -73, -112, 106, 77, -95, 71, -102, 107, 76, -103, -81, -93, 83, -85, 81, 94, 67, -113, -82, 66, -92, 121, -120, -81, -101, -34, 111, -107, 107, -109, 99, 104, AbstractJsonLexerKt.TC_INVALID, -69, -100, 112, -106, 75, -76, 98, 77};

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1391 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1392 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1393 = -194990505;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1394 = 118;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1395 = -1585527044;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m1666(byte b2, short s, int i2, int i3, int i4) {
                String string;
                synchronized (k.f2833) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        int i5 = f1394;
                        int i6 = i2 + i5;
                        int i7 = i6 == -1 ? 1 : 0;
                        if (i7 != 0) {
                            byte[] bArr = f1390;
                            i6 = bArr != null ? (byte) (bArr[f1393 + i3] + i5) : (short) (f1389[f1393 + i3] + i5);
                        }
                        if (i6 > 0) {
                            k.f2836 = ((i3 + i6) - 2) + f1393 + i7;
                            k.f2834 = b2;
                            char c2 = (char) (i4 + f1395);
                            k.f2837 = c2;
                            sb.append(c2);
                            k.f2835 = k.f2837;
                            k.f2838 = 1;
                            while (k.f2838 < i6) {
                                byte[] bArr2 = f1390;
                                if (bArr2 != null) {
                                    int i8 = k.f2836;
                                    k.f2836 = i8 - 1;
                                    k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                                } else {
                                    short[] sArr = f1389;
                                    int i9 = k.f2836;
                                    k.f2836 = i9 - 1;
                                    k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                                }
                                sb.append(k.f2837);
                                k.f2835 = k.f2837;
                                k.f2838++;
                            }
                        }
                        string = sb.toString();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﻛ */
            public final void mo390(Activity activity) {
                f1392 = (f1391 + 115) % 128;
                m1667(m1666((byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 77), (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (-118) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 194990505 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), View.MeasureSpec.getMode(0) + 1585527155).intern(), activity, list);
                int i2 = f1391 + 33;
                f1392 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.p004ironsource.adqualitysdk.sdk.i.jo
            /* JADX INFO: renamed from: ﾒ */
            public final void mo391(Activity activity) {
                f1391 = (f1392 + 109) % 128;
                m1667(m1666((byte) (80 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (short) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 118, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 194990515, View.resolveSize(0, 0) + 1585527155).intern(), activity, list);
                int i2 = f1392 + 47;
                f1391 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1667(String str, final Activity activity, List<String> list2) {
                f1391 = (f1392 + 75) % 128;
                if (cp.m1583(activity, list2)) {
                    final String strN = com.google.firebase.crashlytics.internal.model.a.n(new StringBuilder(), m1666((byte) (ExpandableListView.getPackedPositionType(0L) + 98), (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (-119) - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 194990531, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1585527109), str);
                    cp.m1579(cp.this, strN, true, false, Collections.singletonList(activity));
                    s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.5.3
                        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            cp.m1579(cp.this, strN, false, false, Collections.singletonList(activity));
                        }
                    });
                }
                f1391 = (f1392 + 11) % 128;
            }
        };
        int i2 = f1325 + 85;
        f1324 = i2 % 128;
        if (i2 % 2 == 0) {
            return joVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1581(final io ioVar, boolean z2) {
        int i2 = f1325 + 109;
        f1324 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                throw null;
            }
            if (z2) {
                s.m2924(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.cp.8
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        s.m2926(ioVar);
                    }
                });
                f1324 = (f1325 + 59) % 128;
            } else {
                s.m2926(ioVar);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1601(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.p004ironsource.adqualitysdk.sdk.i.f.f1955) {
            try {
                char[] cArrM2116 = com.p004ironsource.adqualitysdk.sdk.i.f.m2116(f1329, cArr, i2);
                com.p004ironsource.adqualitysdk.sdk.i.f.f1954 = 4;
                while (true) {
                    int i3 = com.p004ironsource.adqualitysdk.sdk.i.f.f1954;
                    if (i3 < cArrM2116.length) {
                        int i4 = i3 - 4;
                        com.p004ironsource.adqualitysdk.sdk.i.f.f1953 = i4;
                        cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f1329));
                        com.p004ironsource.adqualitysdk.sdk.i.f.f1954 = i3 + 1;
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
}
