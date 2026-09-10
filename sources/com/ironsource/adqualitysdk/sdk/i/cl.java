package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1325 = 0;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static int f1326 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1328 = 298;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f1329 = true;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f1330 = true;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private cp f1332;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private JSONObject f1333;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private w f1334;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private js f1335 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private ju f1336;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private dc f1337;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private be f1338;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ck f1339;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ic f1340;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ee f1341;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char[] f1327 = {380, 399, 407, 409, 414, 363, 398, 374, 403, 413, 408, 412, 344, 395, 406, 420, 345, 397, 416, 419, 400, 410, 368, 415, 330, 376, 384, 417, 365, 404, 378, 418, 372, 382, 371, 367, 343, 396, 401};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1331 = TsExtractor.TS_STREAM_TYPE_AC3;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$a$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass4 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1420;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ t f1421;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1422;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1423;

            public AnonymousClass4(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1421 = tVar;
                this.f1422 = jSONObject;
                this.f1423 = obj;
                this.f1420 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1421.mo248(this.f1422, this.f1423, this.f1420);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$b$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass2 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ t f1424;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1425;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1426;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1427;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1428;

            public AnonymousClass2(t tVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1424 = tVar;
                this.f1425 = jSONObject;
                this.f1427 = obj;
                this.f1428 = obj2;
                this.f1426 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1424.mo250(this.f1425, this.f1427, this.f1428, this.f1426);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$c$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass5 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1429;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1430;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1431;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ t f1432;

            public AnonymousClass5(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1432 = tVar;
                this.f1431 = jSONObject;
                this.f1429 = obj;
                this.f1430 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1432.mo249(this.f1431, this.f1429, this.f1430);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$d$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass2 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1433;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1434;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1435;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1436;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ t f1437;

            public AnonymousClass2(t tVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1437 = tVar;
                this.f1435 = jSONObject;
                this.f1434 = obj;
                this.f1433 = obj2;
                this.f1436 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1437.mo247(this.f1435, this.f1434, this.f1433, this.f1436);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$e$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass5 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ t f1438;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1439;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1440;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ Object f1441;

            public AnonymousClass5(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1438 = tVar;
                this.f1439 = jSONObject;
                this.f1441 = obj;
                this.f1440 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1438.mo246(this.f1439, this.f1441, this.f1440);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$f$5, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass5 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1442;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ Object f1443;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1444;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ t f1445;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1446;

            public AnonymousClass5(t tVar, JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                this.f1445 = tVar;
                this.f1446 = jSONObject;
                this.f1442 = obj;
                this.f1444 = obj2;
                this.f1443 = obj3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1445.mo253(this.f1446, this.f1442, this.f1444, this.f1443);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class g<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$g$4, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass4 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1447;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ t f1448;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ Object f1449;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1450;

            public AnonymousClass4(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1448 = tVar;
                this.f1450 = jSONObject;
                this.f1447 = obj;
                this.f1449 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1448.mo251(this.f1450, this.f1447, this.f1449);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class h<K, T> {

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cl$h$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class AnonymousClass1 extends je {

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private /* synthetic */ Object f1451;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private /* synthetic */ JSONObject f1452;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private /* synthetic */ Object f1453;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private /* synthetic */ t f1454;

            public AnonymousClass1(t tVar, JSONObject jSONObject, Object obj, Object obj2) {
                this.f1454 = tVar;
                this.f1452 = jSONObject;
                this.f1451 = obj;
                this.f1453 = obj2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                this.f1454.mo252(this.f1452, this.f1451, this.f1453);
            }
        }
    }

    public cl(cp cpVar, dc dcVar, be beVar, ic icVar, ee eeVar) {
        this.f1340 = icVar;
        ee eeVar2 = new ee(new HashMap(), eeVar, true);
        this.f1341 = eeVar2;
        eeVar2.m2156(m1644().m2376());
        eeVar.m2152(icVar.m2372(), this);
        this.f1337 = dcVar;
        this.f1338 = beVar;
        this.f1339 = m1594();
        this.f1332 = cpVar;
        this.f1334 = new w();
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private void m1593() {
        f1325 = (f1326 + InterfaceC0435l1.d.b.f29109f) % 128;
        this.f1334.m3082();
        f1326 = (f1325 + 95) % 128;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private ck m1594() {
        ck ckVar = new ck() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ck
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1592(final String str, final List<Object> list) {
                final boolean z10 = true;
                final boolean z11 = false;
                cl.m1615(cl.this, str, true, false, list);
                cl.m1632(cl.this, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        cl.m1615(cl.this, str, false, z11, list);
                    }
                }, false);
                cl.m1632(cl.this, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.2.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        cl.m1615(cl.this, str, false, z10, list);
                    }
                }, true);
            }
        };
        f1326 = (f1325 + 97) % 128;
        return ckVar;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private js m1595() {
        js jsVar = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.5
            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                cl clVar = cl.this;
                clVar.m1647(is.f2574, cl.m1630(clVar, activity, (Bundle) null));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                cl clVar = cl.this;
                clVar.m1647(is.f2577, cl.m1630(clVar, activity, (Bundle) null));
            }
        };
        f1326 = (f1325 + 117) % 128;
        return jsVar;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private void m1596() {
        int i10 = f1326 + 83;
        f1325 = i10 % 128;
        int i11 = i10 % 2;
        this.f1334.m3086();
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private void m1597() {
        int i10 = f1325 + 7;
        f1326 = i10 % 128;
        int i11 = i10 % 2;
        this.f1334.m3084();
        if (i11 == 0) {
            throw null;
        }
        int i12 = f1326 + 21;
        f1325 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 63 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private dp m1598() {
        f1326 = (f1325 + InterfaceC0435l1.d.b.f29109f) % 128;
        dp dpVarM1728 = m1651().m1728();
        f1326 = (f1325 + 49) % 128;
        return dpVarM1728;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m1599() {
        f1325 = (f1326 + 11) % 128;
        for (dm dmVar : m1644().m2377()) {
            f1326 = (f1325 + InterfaceC0435l1.d.b.f29109f) % 128;
            if (m1605(dmVar)) {
                m1633(dmVar);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m1604(Activity activity, List list) {
        int i10 = f1326 + InterfaceC0435l1.d.b.f29110g;
        f1325 = i10 % 128;
        if (i10 % 2 == 0) {
            return m1636(activity, list);
        }
        m1636(activity, list);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ee m1607(cl clVar) {
        int i10 = f1325;
        f1326 = (i10 + 25) % 128;
        ee eeVar = clVar.f1341;
        f1326 = (i10 + 53) % 128;
        return eeVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1615(cl clVar, String str, boolean z10, boolean z11, List list) {
        int i10 = f1326 + 21;
        f1325 = i10 % 128;
        int i11 = i10 % 2;
        clVar.m1602(str, z10, z11, (List<Object>) list);
        if (i11 != 0) {
            throw null;
        }
        int i12 = f1325 + 39;
        f1326 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m1630(cl clVar, Activity activity, Bundle bundle) {
        f1326 = (f1325 + 53) % 128;
        JSONObject jSONObjectM1614 = clVar.m1614(activity, bundle);
        f1325 = (f1326 + 71) % 128;
        return jSONObjectM1614;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final void m1637() {
        f1326 = (f1325 + InterfaceC0435l1.d.b.f29114k) % 128;
        m1593();
        m1596();
        m1597();
        if (this.f1335 != null) {
            jt.m2734().m2740(this.f1335);
            this.f1335 = null;
            f1326 = (f1325 + 41) % 128;
        }
        ju juVar = this.f1336;
        if (juVar != null) {
            int i10 = f1325 + 37;
            f1326 = i10 % 128;
            if (i10 % 2 == 0) {
                juVar.m2751();
                this.f1336 = null;
                int i11 = 43 / 0;
            } else {
                juVar.m2751();
                this.f1336 = null;
            }
        }
        this.f1339 = null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final JSONObject m1638() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(is.f2612, m1651().m1737());
            jSONObject.put(is.f2563, m1651().m1734());
            jSONObject.put(is.f2566, m1651().m1738());
        } catch (JSONException e10) {
            String strIntern = m1623((String) null, (ViewConfiguration.getTapTimeout() >> 16) + 127, (int[]) null, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1629(TextUtils.getCapsMode("", 0, 0) + 27, false, 223 - ExpandableListView.getPackedPositionGroup(0L), "ￂ\uffe7\u0014\u0014\u0011\u0014ￂ\u0005\u0014\u0007\u0003\u0016\u000b\u0010\tￂ\u0007\u0018\u0007\u0010\u0016ￂ\f\u0015\u0011\u0010ￜ", 1 - View.resolveSize(0, 0)).intern());
            sb2.append(e10.getLocalizedMessage());
            m.m2972(strIntern, sb2.toString());
        }
        f1326 = (f1325 + 85) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final ck m1639() {
        int i10 = f1325 + 47;
        f1326 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1339;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final be m1640() {
        int i10 = f1326 + 15;
        int i11 = i10 % 128;
        f1325 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        be beVar = this.f1338;
        f1326 = (i11 + 31) % 128;
        return beVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final dc m1641() {
        int i10 = (f1326 + 75) % 128;
        f1325 = i10;
        dc dcVar = this.f1337;
        int i11 = i10 + 13;
        f1326 = i11 % 128;
        if (i11 % 2 != 0) {
            return dcVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final ee m1642() {
        int i10 = (f1326 + 45) % 128;
        f1325 = i10;
        ee eeVar = this.f1341;
        f1326 = (i10 + 91) % 128;
        return eeVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m1643() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1651().m1739());
        sb2.append(m1623((String) null, 127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (int[]) null, "\u0091").intern());
        sb2.append(m1644().m2372());
        String string = sb2.toString();
        f1326 = (f1325 + 37) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final cp m1651() {
        int i10 = (f1326 + 83) % 128;
        f1325 = i10;
        cp cpVar = this.f1332;
        int i11 = i10 + 123;
        f1326 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 73 / 0;
        }
        return cpVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1626(dm dmVar) {
        int i10 = f1325 + 19;
        f1326 = i10 % 128;
        ja jaVar = null;
        if (i10 % 2 == 0) {
            m1625(dmVar.m2028());
            throw null;
        }
        JSONObject jSONObjectM1625 = m1625(dmVar.m2028());
        if (jSONObjectM1625 != null) {
            final String strM2026 = dmVar.m2026();
            if (!TextUtils.isEmpty(strM2026)) {
                f1325 = (f1326 + 51) % 128;
                final dz dzVarM1648 = m1648(strM2026);
                if (dzVarM1648 != null) {
                    jaVar = new ja() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.1

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f1342 = 1;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static int f1343 = 111;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static int f1344;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m1654(int i11, boolean z10, int i12, String str, int i13) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1625) {
                                try {
                                    char[] cArr2 = new char[i11];
                                    com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                                    while (true) {
                                        int i14 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                                        if (i14 >= i11) {
                                            break;
                                        }
                                        com.ironsource.adqualitysdk.sdk.i.d.f1624 = cArr[i14];
                                        cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1622] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1624 + i12);
                                        int i15 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                                        cArr2[i15] = (char) (cArr2[i15] - f1343);
                                        com.ironsource.adqualitysdk.sdk.i.d.f1622 = i15 + 1;
                                    }
                                    if (i13 > 0) {
                                        com.ironsource.adqualitysdk.sdk.i.d.f1623 = i13;
                                        char[] cArr3 = new char[i11];
                                        System.arraycopy(cArr2, 0, cArr3, 0, i11);
                                        int i16 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                                        System.arraycopy(cArr3, 0, cArr2, i11 - i16, i16);
                                        int i17 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                                        System.arraycopy(cArr3, i17, cArr2, 0, i11 - i17);
                                    }
                                    if (z10) {
                                        char[] cArr4 = new char[i11];
                                        com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                                        while (true) {
                                            int i18 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                                            if (i18 >= i11) {
                                                break;
                                            }
                                            cArr4[i18] = cArr2[(i11 - i18) - 1];
                                            com.ironsource.adqualitysdk.sdk.i.d.f1622 = i18 + 1;
                                        }
                                        cArr2 = cArr4;
                                    }
                                    str2 = new String(cArr2);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str2;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.ja
                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        public final List<WebView> mo1655(Object obj) {
                            int i11 = f1342 + 21;
                            f1344 = i11 % 128;
                            try {
                                if (i11 % 2 == 0) {
                                    return (List) dzVarM1648.m2113(cl.m1607(cl.this), cl.this, Collections.singletonList(obj)).m2124();
                                }
                                throw null;
                            } catch (Exception unused) {
                                String strIntern = m1654(16 - View.resolveSizeAndState(0, 0, 0), false, (ViewConfiguration.getPressedStateDuration() >> 16) + 212, "\u0000ￜ\uffff\uffe7\u0004\u000e\u000f\u0000\t\u0000\r￭\u0000\b\n\u000f", 11 - View.MeasureSpec.getSize(0)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m1654(Color.argb(0, 0, 0, 0) + 28, false, 206 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "￦\u0013\u0013\u0010\u0013\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1\u0018\u0006\u0003\ufff7\n\u0006\u0018\u0014\uffc1\u0007\u0013\u0010\u000e\uffc1", 28 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                                sb2.append(strM2026);
                                m.m2972(strIntern, sb2.toString());
                                return null;
                            }
                        }
                    };
                } else {
                    String strM1643 = m1643();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m1629(Drawable.resolveOpacity(0, 0) + 22, false, 224 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0010\u0013\uffc1￮\u0006\u0015\t\u0010\u0005\uffc1\u0005\u0006\u0007\n\u000f\n\u0015\n\u0010\u000f\uffc1\u0007", (ViewConfiguration.getFadingEdgeLength() >> 16) + 3).intern());
                    sb2.append(strM2026);
                    sb2.append(m1623((String) null, 127 - TextUtils.getOffsetBefore("", 0), (int[]) null, "\u0087\u008b\u0098\u0084\u0095\u0099\u0085\u0084\u008b\u0099").intern());
                    cn.m1706(strM1643, sb2.toString());
                }
            }
            m1603(jSONObjectM1625, m1609(false), m1609(true), jaVar);
        }
        f1326 = (f1325 + InterfaceC0435l1.d.b.f29112i) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m1632(cl clVar, iy iyVar, boolean z10) {
        f1325 = (f1326 + InterfaceC0435l1.d.b.f29110g) % 128;
        clVar.m1601(iyVar, z10);
        int i10 = f1326 + 119;
        f1325 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ic m1644() {
        int i10 = f1326 + 87;
        f1325 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1340;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1646() {
        m1599();
        m1617(m1623((String) null, 127 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (int[]) null, "\u0082\u0090\u0089\u008f\u008e\u0089\u0085\u0089\u008b\u0089\u008d\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), new ArrayList());
        f1326 = (f1325 + 63) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m1650(JSONObject jSONObject) {
        f1325 = (f1326 + 45) % 128;
        this.f1333 = kj.m2865(jSONObject, true);
        int i10 = f1325 + 15;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1603(JSONObject jSONObject, l lVar, l lVar2, ja jaVar) {
        f1325 = (f1326 + 65) % 128;
        this.f1334.m3087(jSONObject, m1620(lVar, lVar2), m1595(), jaVar);
        f1325 = (f1326 + 3) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject m1649() {
        int i10 = f1325;
        JSONObject jSONObject = this.f1333;
        f1326 = (i10 + 49) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Context m1652() {
        f1326 = (f1325 + 75) % 128;
        Context contextM1727 = m1651().m1727();
        f1326 = (f1325 + 95) % 128;
        return contextM1727;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m1605(dm dmVar) {
        f1325 = (f1326 + 75) % 128;
        List listMo474 = ar.m468().mo474();
        ISAdQualityAdType iSAdQualityAdTypeM2027 = dmVar.m2027();
        if (listMo474 != null) {
            int i10 = f1325 + 5;
            f1326 = i10 % 128;
            if (i10 % 2 == 0) {
                ISAdQualityAdType iSAdQualityAdType = ISAdQualityAdType.UNKNOWN;
                throw null;
            }
            if (iSAdQualityAdTypeM2027 != ISAdQualityAdType.UNKNOWN) {
                if (listMo474.contains(iSAdQualityAdTypeM2027)) {
                    f1326 = (f1325 + 79) % 128;
                    return false;
                }
                f1326 = (f1325 + 47) % 128;
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1611(dm dmVar) {
        JSONObject jSONObjectM1625 = m1625(dmVar.m2028());
        if (jSONObjectM1625 != null) {
            m1635(jSONObjectM1625, m1600(false), m1600(true));
            f1325 = (f1326 + 75) % 128;
        }
        int i10 = f1325 + 17;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dz m1648(String str) {
        int i10 = f1326;
        f1325 = (i10 + 7) % 128;
        if (str == null) {
            return null;
        }
        int i11 = i10 + 5;
        f1325 = i11 % 128;
        if (i11 % 2 == 0) {
            return m1644().m2375(str);
        }
        dz dzVarM2375 = m1644().m2375(str);
        int i12 = 57 / 0;
        return dzVarM2375;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m1653(iv ivVar) {
        f1326 = (f1325 + 27) % 128;
        this.f1332.m1729().m723(ivVar);
        f1325 = (f1326 + 65) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private JSONObject m1631(JSONObject jSONObject) {
        int i10 = f1325 + 57;
        f1326 = i10 % 128;
        if (i10 % 2 != 0) {
            JSONObject jSONObjectM1638 = m1638();
            kj.m2869(jSONObjectM1638, jSONObject);
            int i11 = f1326 + 37;
            f1325 = i11 % 128;
            if (i11 % 2 == 0) {
                return jSONObjectM1638;
            }
            throw null;
        }
        kj.m2869(m1638(), jSONObject);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private js m1608(final List<String> list) {
        js jsVar = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.8

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1405 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1406 = 1;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static short[] f1407;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int[] f1411 = {-1464529252, -1991758515, -108898556, -862817907, 720120140, 1737959883, -625719624, -1369811249, -1345522564, -767445090, -984640719, 518967860, -1176892880, -1327515013, 1724880594, 1869230132, -406527142, -545372878};

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1409 = 371307163;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1410 = 119;

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f1404 = -1719238902;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static byte[] f1408 = {-102, -112, -126, -92, -115, -124, -64, 91, -106, -100, -124, -98, -122, -94, -77, 100, -112, -102, -51, -61, -50, -49, -55, -17, -88, -45, -39, -63, -37, -61, -33, -16, -95, -51, -92, -21, 13, -25, 27, -24, -4, -17, 7, -25, -5, -1, 31, -34, -23, 15, 8, -44, -1, 5, -19, 7, -17, 11, 28, -51, -7, -100, 124, 105, -121, 122, 123, 126, -117, -98, 72, -126, -120, 112, -118, 114, -114, -97, 80, 124};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private void m1690(String str, Activity activity, Bundle bundle) {
                List<Object> listAsList;
                int i10 = f1406 + 87;
                f1405 = i10 % 128;
                if (i10 % 2 != 0) {
                    Object[] objArr = new Object[3];
                    objArr[1] = activity;
                    objArr[1] = bundle;
                    listAsList = Arrays.asList(objArr);
                } else {
                    listAsList = Arrays.asList(activity, bundle);
                }
                m1694(str, listAsList);
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private void m1691(String str, Activity activity) {
                int i10 = f1406 + 93;
                f1405 = i10 % 128;
                int i11 = i10 % 2;
                m1694(str, Collections.singletonList(activity));
                if (i11 != 0) {
                    int i12 = 34 / 0;
                }
                f1405 = (f1406 + 57) % 128;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public static /* synthetic */ void m1693(AnonymousClass8 anonymousClass8, String str, List list2) {
                f1405 = (f1406 + 83) % 128;
                anonymousClass8.m1692(str, false, list2);
                int i10 = f1405 + 125;
                f1406 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                if (cl.m1604(activity, list)) {
                    f1406 = (f1405 + 33) % 128;
                    m1690(m1695((short) (111 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1719239013, (-121) - Process.getGidForName(""), (-371307163) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), activity, bundle);
                }
                int i10 = f1405 + 57;
                f1406 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 37 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                f1406 = (f1405 + 21) % 128;
                if (cl.m1604(activity, list)) {
                    f1406 = (f1405 + 119) % 128;
                    m1691(m1695((short) ((-125) - Color.alpha(0)), TextUtils.indexOf("", "", 0) + 1719239013, KeyEvent.keyCodeFromString("") - 120, (-371307102) - Color.alpha(0), (byte) (KeyEvent.getMaxKeyCode() >> 16)).intern(), activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                int i10 = f1406 + 7;
                f1405 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 13 / 0;
                    if (!cl.m1604(activity, list)) {
                        return;
                    }
                } else if (!cl.m1604(activity, list)) {
                    return;
                }
                m1691(m1689(new int[]{-96374055, 995172381, -1871642279, -457594463, -688436218, -341945488, -1490489288, 1000080799}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15).intern(), activity);
                f1405 = (f1406 + 85) % 128;
            }

            /* JADX WARN: Code duplicated, block: B:9:0x0021  */
            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                int i10 = f1406 + 41;
                f1405 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 53 / 0;
                    if (cl.m1604(activity, list)) {
                        m1691(m1689(new int[]{-96374055, 995172381, -1871642279, -457594463, -555573853, -678377075, -1369178605, -1300114783, 1380921788, 99866880}, (KeyEvent.getMaxKeyCode() >> 16) + 17).intern(), activity);
                    }
                } else if (cl.m1604(activity, list)) {
                    m1691(m1689(new int[]{-96374055, 995172381, -1871642279, -457594463, -555573853, -678377075, -1369178605, -1300114783, 1380921788, 99866880}, (KeyEvent.getMaxKeyCode() >> 16) + 17).intern(), activity);
                }
                f1405 = (f1406 + 67) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                if (cl.m1604(activity, list)) {
                    f1405 = (f1406 + 1) % 128;
                    m1690(m1695((short) ((ViewConfiguration.getTapTimeout() >> 16) + 6), 1719239014 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (-120) - Color.blue(0), (-371307129) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern(), activity, bundle);
                }
                f1405 = (f1406 + InterfaceC0435l1.d.b.f29110g) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                int i10 = f1406 + 69;
                f1405 = i10 % 128;
                if (i10 % 2 != 0) {
                    cl.m1604(activity, list);
                    throw null;
                }
                if (cl.m1604(activity, list)) {
                    f1405 = (f1406 + 75) % 128;
                    m1691(m1689(new int[]{-96374055, 995172381, -1871642279, -457594463, -1672854210, -556973351, -1689115758, -440059602, 1380921788, 99866880}, TextUtils.getCapsMode("", 0, 0) + 17).intern(), activity);
                }
                int i11 = f1405 + 83;
                f1406 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 65 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                int i10 = f1406 + 51;
                f1405 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 5 / 0;
                    if (!cl.m1604(activity, list)) {
                        return;
                    }
                } else if (!cl.m1604(activity, list)) {
                    return;
                }
                m1691(m1695((short) (50 - ExpandableListView.getPackedPositionGroup(0L)), 1719239013 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-16777336) - Color.rgb(0, 0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 371307147, (byte) View.MeasureSpec.getMode(0)).intern(), activity);
                f1405 = (f1406 + 21) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* JADX INFO: renamed from: ﾒ */
            public final void mo397(Activity activity) {
                int i10 = f1406 + 87;
                f1405 = i10 % 128;
                m1691((i10 % 2 != 0 ? m1689(new int[]{1960114259, -1226481532, -1848672339, 1593490767, 2117993583, -1731552012, -1521214036, 1822768489, 103618756, -786815120, 765089994, 1511309865, 1380921788, 99866880}, 16 << ((byte) KeyEvent.getModifierMetaStateMask())) : m1689(new int[]{1960114259, -1226481532, -1848672339, 1593490767, 2117993583, -1731552012, -1521214036, 1822768489, 103618756, -786815120, 765089994, 1511309865, 1380921788, 99866880}, 24 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), activity);
                int i11 = f1405 + 15;
                f1406 = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 93 / 0;
                }
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m1689(int[] iArr, int i10) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.a.f61) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f1411.clone();
                        com.ironsource.adqualitysdk.sdk.i.a.f58 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.a.f58;
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
                                com.ironsource.adqualitysdk.sdk.i.a.f59 = (c4 << 16) + c5;
                                com.ironsource.adqualitysdk.sdk.i.a.f60 = (c10 << 16) + c11;
                                com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                                for (int i13 = 0; i13 < 16; i13++) {
                                    int i14 = com.ironsource.adqualitysdk.sdk.i.a.f59 ^ iArr2[i13];
                                    com.ironsource.adqualitysdk.sdk.i.a.f59 = i14;
                                    int iM200 = com.ironsource.adqualitysdk.sdk.i.a.m200(i14) ^ com.ironsource.adqualitysdk.sdk.i.a.f60;
                                    int i15 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                                    com.ironsource.adqualitysdk.sdk.i.a.f59 = iM200;
                                    com.ironsource.adqualitysdk.sdk.i.a.f60 = i15;
                                }
                                int i16 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                                int i17 = com.ironsource.adqualitysdk.sdk.i.a.f60;
                                com.ironsource.adqualitysdk.sdk.i.a.f59 = i17;
                                com.ironsource.adqualitysdk.sdk.i.a.f60 = i16;
                                int i18 = i16 ^ iArr2[16];
                                com.ironsource.adqualitysdk.sdk.i.a.f60 = i18;
                                int i19 = i17 ^ iArr2[17];
                                com.ironsource.adqualitysdk.sdk.i.a.f59 = i19;
                                cArr[0] = (char) (i19 >>> 16);
                                cArr[1] = (char) i19;
                                cArr[2] = (char) (i18 >>> 16);
                                cArr[3] = (char) i18;
                                com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                                int i20 = com.ironsource.adqualitysdk.sdk.i.a.f58;
                                cArr2[i20 << 1] = cArr[0];
                                cArr2[(i20 << 1) + 1] = cArr[1];
                                cArr2[(i20 << 1) + 2] = cArr[2];
                                cArr2[(i20 << 1) + 3] = cArr[3];
                                com.ironsource.adqualitysdk.sdk.i.a.f58 = i20 + 2;
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
            private void m1692(String str, boolean z10, List<Object> list2) {
                cl.m1615(cl.this, f2.k(m1689(new int[]{953042354, -1035908492, 1893934803, -1877540370, -415828309, 1847990477, -1195565543, -826211510, -732595061, 254136680}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 17), str, new StringBuilder()), z10, false, list2);
                f1406 = (f1405 + 5) % 128;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m1695(short s10, int i10, int i11, int i12, byte b10) {
                String string;
                synchronized (n.f3070) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f1410;
                        int i14 = i11 + i13;
                        int i15 = i14 == -1 ? 1 : 0;
                        if (i15 != 0) {
                            byte[] bArr = f1408;
                            i14 = bArr != null ? (byte) (bArr[f1409 + i12] + i13) : (short) (f1407[f1409 + i12] + i13);
                        }
                        if (i14 > 0) {
                            n.f3072 = ((i12 + i14) - 2) + f1409 + i15;
                            n.f3073 = b10;
                            char c4 = (char) (i10 + f1404);
                            n.f3074 = c4;
                            sb2.append(c4);
                            n.f3075 = n.f3074;
                            n.f3071 = 1;
                            while (n.f3071 < i14) {
                                byte[] bArr2 = f1408;
                                if (bArr2 != null) {
                                    int i16 = n.f3072;
                                    n.f3072 = i16 - 1;
                                    n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                                } else {
                                    short[] sArr = f1407;
                                    int i17 = n.f3072;
                                    n.f3072 = i17 - 1;
                                    n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                                }
                                sb2.append(n.f3074);
                                n.f3075 = n.f3074;
                                n.f3071++;
                            }
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
            /* JADX INFO: renamed from: ﾇ */
            public final void mo396(Activity activity) {
                f1405 = (f1406 + 51) % 128;
                m1691(m1689(new int[]{1960114259, -1226481532, -301429666, 893821826, -78672336, 435823595, 282731844, 933568375, 765089994, 1511309865, 1380921788, 99866880}, 20 - Process.getGidForName("")).intern(), activity);
                int i10 = f1405 + 9;
                f1406 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m1694(final String str, final List<Object> list2) {
                m1692(str, true, list2);
                p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.8.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        AnonymousClass8.m1693(AnonymousClass8.this, str, list2);
                    }
                });
                int i10 = f1405 + 65;
                f1406 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }
        };
        f1325 = (f1326 + 17) % 128;
        return jsVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private l m1609(final boolean z10) {
        l lVar = new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.14

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1367 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1368;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1370 = {'a', 1658, 3192, 4659, 6155, 7910, 9432, 10931, 12425, 14187, 15688, 'a', 1658, 3192, 4659, 6155, 7910, 9432, 10931, 12425, 14187, 15688, 17167, 18704, 20466, 21974, 23459, 'a', 1658, 3199, 4662, 6161, 7925, 9439, 10935, 12436, 51230, 52741, 50176, 55881, 53358, 54922, 60576, 58056, 63723, 65335, 62753, 35674, 33146, 34739, 40360, 'a', 1658, 3199, 4662, 6167, 7909, 9425, 10934, 1900, 365, 2883, 5431, 7971, 6648, 9178, 11689, 14217, 12412, 14931, 17460, 19167, 19667, 18166, 22705, 21176, 21580, 28275, 24599, 31293, 32229, 30696, 2443, 933, 1344, 8056, 4399, 11070, 11571, 9434, 16102, 'c', 1643, 3151, 4654, 6167, 7931, 9457, 10916, 12437, 14176, 15704, 'A', 1661, 3144, 4659, 6158, 7935, 9408, 10923, 12465, 14186, 15712, 17187, 18715, 20466, 21953, 23468, 24965, 26508, 28210};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f1369 = -5406606946542287330L;

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo246(JSONObject jSONObject, WebView webView, Activity activity) {
                f1368 = (f1367 + 59) % 128;
                mo246(jSONObject, webView, activity);
                int i10 = f1368 + 29;
                f1367 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo248(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1368 + 47;
                f1367 = i10 % 128;
                int i11 = i10 % 2;
                mo248(jSONObject, webView, activity);
                if (i11 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo249(JSONObject jSONObject, WebView webView, Activity activity) {
                f1368 = (f1367 + 77) % 128;
                mo249(jSONObject, webView, activity);
                int i10 = f1367 + 91;
                f1368 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 3 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo251(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1368 + 9;
                f1367 = i10 % 128;
                int i11 = i10 % 2;
                mo251(jSONObject, webView, activity);
                if (i11 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo252(JSONObject jSONObject, WebView webView, Activity activity) {
                f1368 = (f1367 + InterfaceC0435l1.d.b.f29114k) % 128;
                mo252(jSONObject, webView, activity);
                f1368 = (f1367 + 81) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo247(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1368 + 117;
                f1367 = i10 % 128;
                int i11 = i10 % 2;
                mo247(jSONObject, webView, obj, activity);
                if (i11 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ */
            public final void mo246(JSONObject jSONObject, WebView webView, Activity activity) {
                f1368 = (f1367 + 81) % 128;
                m1686(m1685((char) View.resolveSizeAndState(0, 0, 0), 12 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), TextUtils.indexOf("", "", 0) + 16).intern(), jSONObject, webView, null, activity);
                int i10 = f1367 + 29;
                f1368 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 27 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo250(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1367 + 41;
                f1368 = i10 % 128;
                int i11 = i10 % 2;
                mo250(jSONObject, webView, obj, activity);
                if (i11 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾇ */
            public final void mo249(JSONObject jSONObject, WebView webView, Activity activity) {
                int i10 = f1367 + 89;
                f1368 = i10 % 128;
                if (i10 % 2 != 0) {
                    m1686(m1685((char) TextUtils.getCapsMode("", 0, 1), View.MeasureSpec.getSize(0), 106 >>> View.MeasureSpec.makeMeasureSpec(1, 0)).intern(), jSONObject, webView, null, activity);
                } else {
                    m1686(m1685((char) TextUtils.getCapsMode("", 0, 0), View.MeasureSpec.getSize(0), 11 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), jSONObject, webView, null, activity);
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo253(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1368 + 119;
                f1367 = i10 % 128;
                int i11 = i10 % 2;
                mo253(jSONObject, webView, obj, activity);
                if (i11 == 0) {
                    int i12 = 48 / 0;
                }
                int i13 = f1367 + 77;
                f1368 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 57 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻐ */
            public final void mo250(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1368 = (f1367 + 39) % 128;
                m1686(m1685((char) Color.green(0), 27 - (ViewConfiguration.getTapTimeout() >> 16), 9 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), jSONObject, webView, obj, activity);
                int i10 = f1367 + InterfaceC0435l1.d.b.f29107d;
                f1368 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻛ */
            public final void mo253(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                f1367 = (f1368 + 1) % 128;
                m1686(m1685((char) (Color.blue(0) + 19112), TextUtils.lastIndexOf("", '0', 0, 0) + 72, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21).intern(), jSONObject, webView, obj, activity);
                int i10 = f1368 + 25;
                f1367 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ */
            public final void mo247(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                int i10 = f1368 + 123;
                f1367 = i10 % 128;
                if (i10 % 2 == 0) {
                    m1686(m1685((char) (51327 >>> View.resolveSize(1, 0)), ']' >> AndroidCharacter.getMirror('K'), 55 >>> (ViewConfiguration.getEdgeSlop() >>> 68)).intern(), jSONObject, webView, obj, activity);
                } else {
                    m1686(m1685((char) (51327 - View.resolveSize(0, 0)), 'T' - AndroidCharacter.getMirror('0'), 15 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), jSONObject, webView, obj, activity);
                }
                f1368 = (f1367 + 79) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﾒ */
            public final void mo251(JSONObject jSONObject, WebView webView, Activity activity) {
                f1368 = (f1367 + 5) % 128;
                m1686(m1685((char) (Color.alpha(0) + 1818), 58 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11).intern(), jSONObject, webView, null, activity);
                int i10 = f1368 + 97;
                f1367 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1686(String str, JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                cl.m1615(cl.this, f2.k(m1685((char) Color.blue(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + InterfaceC0435l1.d.b.f29106c, 19 - (ViewConfiguration.getFadingEdgeLength() >> 16)), str, new StringBuilder()), z10, false, Arrays.asList(jSONObject, webView, obj, activity));
                int i10 = f1367 + 7;
                f1368 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ﻐ */
            public final void mo252(JSONObject jSONObject, WebView webView, Activity activity) {
                f1368 = (f1367 + 59) % 128;
                m1686(m1685((char) TextUtils.indexOf("", ""), (KeyEvent.getMaxKeyCode() >> 16) + 91, 11 - Color.green(0)).intern(), jSONObject, webView, null, activity);
                f1367 = (f1368 + 33) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.l
            /* JADX INFO: renamed from: ｋ */
            public final void mo248(JSONObject jSONObject, WebView webView, Activity activity) {
                f1368 = (f1367 + 25) % 128;
                m1686(m1685((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 51 - View.resolveSize(0, 0), 7 - TextUtils.lastIndexOf("", '0')).intern(), jSONObject, webView, null, activity);
                int i10 = f1368 + 81;
                f1367 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m1685(char c4, int i10, int i11) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.c.f1153) {
                    try {
                        char[] cArr = new char[i11];
                        com.ironsource.adqualitysdk.sdk.i.c.f1154 = 0;
                        while (true) {
                            int i12 = com.ironsource.adqualitysdk.sdk.i.c.f1154;
                            if (i12 < i11) {
                                cArr[i12] = (char) ((((long) f1370[i10 + i12]) ^ (((long) i12) * f1369)) ^ ((long) c4));
                                com.ironsource.adqualitysdk.sdk.i.c.f1154 = i12 + 1;
                            } else {
                                str = new String(cArr);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            }
        };
        int i10 = f1325 + 69;
        f1326 = i10 % 128;
        if (i10 % 2 != 0) {
            return lVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r4 = m1648(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r4 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        m1628(r0, r3, r1, new com.ironsource.adqualitysdk.sdk.i.cl.AnonymousClass10(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r7 = m1643();
        r0 = new java.lang.StringBuilder();
        r0.append(m1629(22 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), false, 225 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), "\u0010\u0013\uffc1￮\u0006\u0015\t\u0010\u0005\uffc1\u0005\u0006\u0007\n\u000f\n\u0015\n\u0010\u000f\uffc1\u0007", 3 - android.graphics.Color.argb(0, 0, 0, 0)).intern());
        r0.append(r8);
        r0.append(m1623((java.lang.String) null, 127 - android.text.TextUtils.getTrimmedLength(""), (int[]) null, "\u0087\u008b\u0098\u0084\u0095\u0099\u0085\u0084\u008b\u0099").intern());
        com.ironsource.adqualitysdk.sdk.i.cn.m1706(r7, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        m1634(r0, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L11;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m1616(com.ironsource.adqualitysdk.sdk.i.dm r8) {
        /*
            r7 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.cl.f1326
            int r0 = r0 + 41
            int r0 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cl.f1325 = r0
            org.json.JSONObject r0 = r8.m2028()
            org.json.JSONObject r0 = r7.m1625(r0)
            if (r0 == 0) goto La6
            int r1 = com.ironsource.adqualitysdk.sdk.i.cl.f1326
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.cl.f1325 = r2
            int r1 = r1 % 2
            r2 = 0
            if (r1 == 0) goto L32
            java.lang.String r8 = r8.m2029()
            com.ironsource.adqualitysdk.sdk.i.q r1 = r7.m1612(r2)
            com.ironsource.adqualitysdk.sdk.i.q r3 = r7.m1612(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto La3
            goto L45
        L32:
            java.lang.String r8 = r8.m2029()
            r1 = 1
            com.ironsource.adqualitysdk.sdk.i.q r1 = r7.m1612(r1)
            com.ironsource.adqualitysdk.sdk.i.q r3 = r7.m1612(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r8)
            if (r4 != 0) goto La3
        L45:
            com.ironsource.adqualitysdk.sdk.i.dz r4 = r7.m1648(r8)
            if (r4 == 0) goto L54
            com.ironsource.adqualitysdk.sdk.i.cl$10 r8 = new com.ironsource.adqualitysdk.sdk.i.cl$10
            r8.<init>()
            r7.m1628(r0, r3, r1, r8)
            return
        L54:
            java.lang.String r7 = r7.m1643()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = android.view.ViewConfiguration.getScrollBarSize()
            int r1 = r1 >> 8
            int r1 = 22 - r1
            long r3 = android.os.Process.getElapsedCpuTime()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r3 = 225 - r3
            int r4 = android.graphics.Color.argb(r2, r2, r2, r2)
            int r4 = 3 - r4
            java.lang.String r5 = "\u0010\u0013\uffc1￮\u0006\u0015\t\u0010\u0005\uffc1\u0005\u0006\u0007\n\u000f\n\u0015\n\u0010\u000f\uffc1\u0007"
            java.lang.String r1 = m1629(r1, r2, r3, r5, r4)
            java.lang.String r1 = r1.intern()
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = ""
            int r8 = android.text.TextUtils.getTrimmedLength(r8)
            int r8 = 127 - r8
            java.lang.String r1 = "\u0087\u008b\u0098\u0084\u0095\u0099\u0085\u0084\u008b\u0099"
            r2 = 0
            java.lang.String r8 = m1623(r2, r8, r2, r1)
            java.lang.String r8 = r8.intern()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.ironsource.adqualitysdk.sdk.i.cn.m1706(r7, r8)
            return
        La3:
            r7.m1634(r0, r3, r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cl.m1616(com.ironsource.adqualitysdk.sdk.i.dm):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private q m1610(final q qVar, final q qVar2) {
        int i10 = f1325 + 57;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (qVar == null) {
            qVar = new q();
        }
        if (qVar2 == null) {
            qVar2 = new q();
        }
        q qVar3 = new q() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.19
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻛ */
            public final void mo250(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo250(jSONObject, view, obj, activity);
                p.m3001(new b.AnonymousClass2(qVar, jSONObject, view, obj, activity));
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ */
            public final void mo253(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo253(jSONObject, view, obj, activity);
                p.m3001(new f.AnonymousClass5(qVar, jSONObject, view, obj, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ */
            public final void mo248(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo248(jSONObject, view, activity);
                p.m3001(new a.AnonymousClass4(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final void mo246(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo246(jSONObject, view, activity);
                p.m3001(new e.AnonymousClass5(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ */
            public final void mo249(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo249(jSONObject, view, activity);
                p.m3001(new c.AnonymousClass5(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻛ */
            public final void mo251(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo251(jSONObject, view, activity);
                p.m3001(new g.AnonymousClass4(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ */
            public final void mo252(JSONObject jSONObject, View view, Activity activity) {
                qVar2.mo252(jSONObject, view, activity);
                p.m3001(new h.AnonymousClass1(qVar, jSONObject, view, activity));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final void mo247(JSONObject jSONObject, View view, Object obj, Activity activity) {
                qVar2.mo247(jSONObject, view, obj, activity);
                p.m3001(new d.AnonymousClass2(qVar, jSONObject, view, obj, activity));
            }
        };
        f1326 = (f1325 + InterfaceC0435l1.d.b.f29105b) % 128;
        return qVar3;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m1606(String str) {
        f1326 = (f1325 + InterfaceC0435l1.d.b.f29114k) % 128;
        boolean zEndsWith = str.endsWith(m1623((String) null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), (int[]) null, "\u008a\u008a\u008e\u008f\u0092\u008d").intern());
        f1326 = (f1325 + 73) % 128;
        return zEndsWith;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private v m1600(final boolean z10) {
        v vVar = new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.11

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static short[] f1350 = null;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1351 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static byte[] f1352 = {82, 65, -75, 88, 81, 80, -89, -120, 77, -82, -62, -45, -47, 30, -52, -46, -63, 53, -40, -47, -48, 39, 8, -51, 46, 109, 104, -102, 104, 111, -69, 77, -111, 27, -17, -52, -49, 30, -48, -51, -56, 58, -56, -49, 27, -19, 49, 72, 69, -77, -76, -98, 104, -76, -33, -35, 37, 34, -51, 32, 19, -22, 50, -36, -45, -32, -17, 9, -41, 55, -32, -17, 26, 27, -49, 56, 30, 24, 27, -20, -61, 7, 27, 8, 26, 21, -13, 45, -60, -30, -25, 29, -30, 14, 124, -51, 55, -55, 49, -63, -54, -35, 40, -29, 10, -56, -53, 54, -59, -46, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1353 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1354 = -643014598;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1355 = 4067004;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1356 = 114;

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo246(JSONObject jSONObject, WebView webView, View view) {
                f1353 = (f1351 + InterfaceC0435l1.d.b.f29105b) % 128;
                mo246(jSONObject, webView, view);
                f1353 = (f1351 + 7) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo248(JSONObject jSONObject, WebView webView, View view) {
                f1351 = (f1353 + 71) % 128;
                mo248(jSONObject, webView, view);
                f1351 = (f1353 + InterfaceC0435l1.d.b.f29105b) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo249(JSONObject jSONObject, WebView webView, View view) {
                f1353 = (f1351 + 23) % 128;
                mo249(jSONObject, webView, view);
                int i10 = f1353 + 67;
                f1351 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 47 / 0;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo251(JSONObject jSONObject, WebView webView, View view) {
                int i10 = f1353 + 73;
                f1351 = i10 % 128;
                int i11 = i10 % 2;
                mo251(jSONObject, webView, view);
                if (i11 != 0) {
                    throw null;
                }
                f1351 = (f1353 + 1) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo252(JSONObject jSONObject, WebView webView, View view) {
                f1351 = (f1353 + 31) % 128;
                mo252(jSONObject, webView, view);
                f1351 = (f1353 + 3) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo247(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1353 = (f1351 + 53) % 128;
                mo247(jSONObject, webView, obj, view);
                int i10 = f1351 + 91;
                f1353 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo252(JSONObject jSONObject, WebView webView, View view) {
                f1353 = (f1351 + 95) % 128;
                m1658(m1657((short) ((Process.getThreadPriority(0) + 20) >> 6), (-4066906) - TextUtils.indexOf((CharSequence) "", '0', 0), (-103) - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 643014682, (byte) (28 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), jSONObject, webView, null, view);
                int i10 = f1353 + 117;
                f1351 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo250(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1353 = (f1351 + 23) % 128;
                mo250(jSONObject, webView, obj, view);
                int i10 = f1353 + 91;
                f1351 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 17 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo246(JSONObject jSONObject, WebView webView, View view) {
                f1351 = (f1353 + 51) % 128;
                m1658(m1657((short) Color.argb(0, 0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 4066907, (-97) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 643014608, (byte) (45 - View.getDefaultSize(0, 0))).intern(), jSONObject, webView, null, view);
                int i10 = f1353 + 67;
                f1351 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo253(JSONObject jSONObject, WebView webView, Object obj, View view) {
                int i10 = f1353 + 25;
                f1351 = i10 % 128;
                int i11 = i10 % 2;
                mo253(jSONObject, webView, obj, view);
                if (i11 != 0) {
                    int i12 = 64 / 0;
                }
                f1351 = (f1353 + 5) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo248(JSONObject jSONObject, WebView webView, View view) {
                f1351 = (f1353 + 91) % 128;
                m1658(m1657((short) TextUtils.indexOf("", "", 0, 0), 61909 - AndroidCharacter.getMirror('0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 107, 643014645 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-73) - TextUtils.getOffsetBefore("", 0))).intern(), jSONObject, webView, null, view);
                f1351 = (f1353 + 47) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo249(JSONObject jSONObject, WebView webView, View view) {
                f1351 = (f1353 + 13) % 128;
                m1658(m1657((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-4066906) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-103) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 643014597, (byte) ((-83) - View.getDefaultSize(0, 0))).intern(), jSONObject, webView, null, view);
                int i10 = f1353 + 79;
                f1351 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo250(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1351 = (f1353 + InterfaceC0435l1.d.b.f29112i) % 128;
                m1658(m1657((short) (ViewConfiguration.getTapTimeout() >> 16), (-4066907) - Color.blue(0), AndroidCharacter.getMirror('0') - 153, 643014623 - TextUtils.getCapsMode("", 0, 0), (byte) ((-110) - TextUtils.indexOf("", "", 0, 0))).intern(), jSONObject, webView, obj, view);
                f1351 = (f1353 + 65) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo247(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1351 = (f1353 + 121) % 128;
                m1658(m1657((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-4066906) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getTrimmedLength("") - 99, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 643014631, (byte) (49 - MotionEvent.axisFromString(""))).intern(), jSONObject, webView, obj, view);
                int i10 = f1353 + 3;
                f1351 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo253(JSONObject jSONObject, WebView webView, Object obj, View view) {
                f1351 = (f1353 + 85) % 128;
                m1658(m1657((short) (AndroidCharacter.getMirror('0') - '0'), (-4066885) - View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 95, 643014663 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 26)).intern(), jSONObject, webView, obj, view);
                f1353 = (f1351 + 51) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.v
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo251(JSONObject jSONObject, WebView webView, View view) {
                f1351 = (f1353 + 3) % 128;
                m1658(m1657((short) (ViewConfiguration.getTapTimeout() >> 16), (-4066886) - TextUtils.indexOf("", ""), TextUtils.indexOf("", "") - 102, View.MeasureSpec.makeMeasureSpec(0, 0) + 643014652, (byte) (32 - (ViewConfiguration.getTapTimeout() >> 16))).intern(), jSONObject, webView, null, view);
                f1351 = (f1353 + 81) % 128;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m1657(short s10, int i10, int i11, int i12, byte b10) {
                String string;
                synchronized (n.f3070) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f1356;
                        int i14 = i11 + i13;
                        int i15 = i14 == -1 ? 1 : 0;
                        if (i15 != 0) {
                            byte[] bArr = f1352;
                            if (bArr != null) {
                                i14 = (byte) (bArr[f1354 + i12] + i13);
                            } else {
                                i14 = (short) (f1350[f1354 + i12] + i13);
                            }
                        }
                        if (i14 > 0) {
                            n.f3072 = ((i12 + i14) - 2) + f1354 + i15;
                            n.f3073 = b10;
                            char c4 = (char) (i10 + f1355);
                            n.f3074 = c4;
                            sb2.append(c4);
                            n.f3075 = n.f3074;
                            n.f3071 = 1;
                            while (n.f3071 < i14) {
                                byte[] bArr2 = f1352;
                                if (bArr2 != null) {
                                    int i16 = n.f3072;
                                    n.f3072 = i16 - 1;
                                    n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                                } else {
                                    short[] sArr = f1350;
                                    int i17 = n.f3072;
                                    n.f3072 = i17 - 1;
                                    n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                                }
                                sb2.append(n.f3074);
                                n.f3075 = n.f3074;
                                n.f3071++;
                            }
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private void m1658(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
                cl.m1615(cl.this, f2.k(m1657((short) Color.argb(0, 0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 4066917, (-97) - View.getDefaultSize(0, 0), 643014691 - TextUtils.lastIndexOf("", '0', 0), (byte) ((-64) - Color.blue(0))), str, new StringBuilder()), z10, false, Arrays.asList(jSONObject, webView, obj, view));
                f1353 = (f1351 + 81) % 128;
            }
        };
        int i10 = f1325 + InterfaceC0435l1.d.b.f29105b;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 50 / 0;
        }
        return vVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0071 A[PHI: r17
  0x0071: PHI (r17v3 long) = (r17v1 long), (r17v4 long) binds: [B:20:0x00c9, B:12:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb A[PHI: r17
  0x00fb: PHI (r17v7 long) = (r17v0 long), (r17v1 long), (r17v2 long), (r17v4 long), (r17v5 long), (r17v8 long) binds: [B:24:0x00e6, B:18:0x00be, B:15:0x0096, B:12:0x006f, B:6:0x0039, B:4:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1633(dm dmVar) {
        long j10;
        byte b10;
        String strM2030 = dmVar.m2030();
        switch (strM2030.hashCode()) {
            case -1825565413:
                j10 = 0;
                if (!strM2030.equals(m1623((String) null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), (int[]) null, "\u0082\u008f\u0092\u0094\u0092\u0082\u0095\u0089\u0088\u0094\u0085\u0089\u0093\u0089\u0085\u0092\u008e").intern())) {
                    b10 = -1;
                } else {
                    int i10 = f1326 + 17;
                    f1325 = i10 % 128;
                    b10 = i10 % 2 != 0 ? (char) 5 : (char) 3;
                }
                break;
            case -1655966961:
                j10 = 0;
                if (!strM2030.equals(m1629(8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), false, 238 - View.MeasureSpec.makeMeasureSpec(0, 0), "\ufff6\u0007￼\t￼\u0007\f\ufff4", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 7).intern())) {
                    b10 = -1;
                } else {
                    int i11 = f1326 + 79;
                    f1325 = i11 % 128;
                    if (i11 % 2 == 0) {
                        b10 = 0;
                    } else {
                        b10 = 1;
                    }
                }
                break;
            case -787751952:
                j10 = 0;
                if (!strM2030.equals(m1629(7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, TextUtils.getTrimmedLength("") + 239, "\ufff6\u0000\ufffb\t\t\u0001", 4 - View.getDefaultSize(0, 0)).intern())) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case 3619493:
                j10 = 0;
                if (!strM2030.equals(m1629((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, true, 239 - (ViewConfiguration.getPressedStateDuration() >> 16), "\b\t\ufff7\ufffb", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern())) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case 1144592183:
                j10 = 0;
                if (!strM2030.equals(m1623((String) null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, (int[]) null, "\u008a\u0098\u0092\u0084\u0097\u0096\u0096\u008e").intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1326 + 123;
                    f1325 = i12 % 128;
                    b10 = i12 % 2 == 0 ? (byte) 4 : (byte) 5;
                }
                break;
            default:
                j10 = 0;
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            m1626(dmVar);
            m1627(m1629(7 - TextUtils.lastIndexOf("", '0'), false, 238 - KeyEvent.keyCodeFromString(""), "\ufff6\u0007￼\t￼\u0007\f\ufff4", 7 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), dmVar);
            return;
        }
        if (b10 == 1) {
            m1616(dmVar);
            m1627(m1629((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 3, true, Gravity.getAbsoluteGravity(0, 0) + 239, "\b\t\ufff7\ufffb", Color.rgb(0, 0, 0) + 16777217).intern(), dmVar);
            return;
        }
        if (b10 == 2) {
            m1611(dmVar);
            m1627(m1629(6 - KeyEvent.normalizeMetaState(0), true, Gravity.getAbsoluteGravity(0, 0) + 239, "\ufff6\u0000\ufffb\t\t\u0001", 3 - ExpandableListView.getPackedPositionChild(j10)).intern(), dmVar);
            int i13 = f1326 + 51;
            f1325 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 50 / 0;
                return;
            }
            return;
        }
        if (b10 != 3) {
            if (b10 != 4) {
                return;
            }
            this.f1336 = new ju(m1619(m1613(dmVar.m2031())));
        } else if (this.f1335 == null) {
            f1325 = (f1326 + 87) % 128;
            this.f1335 = m1608(m1613(dmVar.m2031()));
            jt.m2734().m2736(this.f1335);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1645(String str, List<Object> list) {
        m1617(f2.k(m1629(16 - KeyEvent.normalizeMetaState(0), false, (Process.myPid() >> 22) + 227, "\ufff1\r\r\u000b\n\uffff￠\u0010\r\uffff\u0002\u0001\uffff\u0011\u0012ￌ", (ViewConfiguration.getPressedStateDuration() >> 16) + 16), str, new StringBuilder()), list);
        int i10 = f1325 + 71;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1647(String str, JSONObject jSONObject) {
        if (str.equals(m1629(12 - TextUtils.indexOf("", "", 0), false, TextUtils.lastIndexOf("", '0') + 234, "\ufff9￼\ufff7￼\u0001\u000b\b\u0004\ufff9\u0011�￼", 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
            this.f1332.m1729().m725(jSONObject);
        } else if (str.equals(m1629(((byte) KeyEvent.getModifierMetaStateMask()) + 10, false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 231, "\ufff9�\u0006\t\r\uffff\ufffe\ufffb\ufffe", Drawable.resolveOpacity(0, 0) + 7).intern())) {
            int i10 = f1326 + 91;
            f1325 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f1332.m1729().m722(jSONObject);
                throw null;
            }
            this.f1332.m1729().m722(jSONObject);
        }
        JSONObject jSONObjectM2855 = kj.m2855(m1631(jSONObject));
        if (str.equals(is.f2571)) {
            f1326 = (f1325 + 51) % 128;
            this.f1332.m1729().m729(jSONObjectM2855);
            return;
        }
        if (str.equals(is.f2570)) {
            this.f1332.m1729().m731(jSONObjectM2855);
            return;
        }
        if (str.equals(is.f2577)) {
            int i11 = f1325 + 7;
            f1326 = i11 % 128;
            if (i11 % 2 != 0) {
                this.f1332.m1729().m726(jSONObjectM2855);
                return;
            } else {
                this.f1332.m1729().m726(jSONObjectM2855);
                throw null;
            }
        }
        if (str.equals(is.f2574)) {
            f1325 = (f1326 + 7) % 128;
            this.f1332.m1729().m718(jSONObjectM2855);
            return;
        }
        if (str.equals(is.f2569)) {
            int i12 = f1325 + 43;
            f1326 = i12 % 128;
            if (i12 % 2 != 0) {
                this.f1332.m1729().m720(jSONObjectM2855);
                return;
            } else {
                this.f1332.m1729().m720(jSONObjectM2855);
                throw null;
            }
        }
        if (str.equals(is.f2572)) {
            this.f1332.m1729().m721(jSONObjectM2855);
            return;
        }
        if (str.equals(is.f2568)) {
            int i13 = f1326 + 121;
            f1325 = i13 % 128;
            if (i13 % 2 == 0) {
                this.f1332.m1729().m719(jSONObjectM2855);
                return;
            } else {
                this.f1332.m1729().m719(jSONObjectM2855);
                throw null;
            }
        }
        this.f1332.m1729().m724(str, jSONObject);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1627(String str, dm dmVar) {
        int i10 = f1325 + 25;
        f1326 = i10 % 128;
        if (i10 % 2 != 0) {
            JSONObject jSONObjectM1625 = m1625(dmVar.m2028());
            if (jSONObjectM1625 == null || !jSONObjectM1625.has(m1629(18 - Color.blue(0), false, (ViewConfiguration.getWindowTouchSlop() >> 8) + 234, "￫\u0010\u0007￼\u000b\u0006\f\ufffa\uffffￛ￼\u000b￼\ufffa\u000b\u0000\u0006\u0005", 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                return;
            }
            f1326 = (f1325 + 25) % 128;
            jw.e eVarM2760 = jw.e.m2760(jSONObjectM1625.optString(m1629(18 - View.resolveSizeAndState(0, 0, 0), false, (ViewConfiguration.getTapTimeout() >> 16) + 234, "￫\u0010\u0007￼\u000b\u0006\f\ufffa\uffffￛ￼\u000b￼\ufffa\u000b\u0000\u0006\u0005", TextUtils.indexOf("", "", 0, 0) + 4).intern(), null));
            String strM1624 = m1624(str, jSONObjectM1625);
            if (eVarM2760 != null) {
                f1325 = (f1326 + 63) % 128;
                jw.m2753().m2758(strM1624, eVarM2760);
                return;
            }
            return;
        }
        m1625(dmVar.m2028());
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1602(String str, boolean z10, boolean z11, List<Object> list) {
        try {
            dh dhVarM2373 = this.f1340.m2373(str);
            if (dhVarM2373 != null) {
                String strM1929 = dhVarM2373.m1929();
                dz dzVarM2375 = this.f1340.m2375(dhVarM2373.m1929());
                if (dzVarM2375 != null) {
                    int i10 = f1325 + InterfaceC0435l1.d.b.f29112i;
                    f1326 = i10 % 128;
                    if (i10 % 2 != 0) {
                        if (z10 == dhVarM2373.m1930() && z11 == dhVarM2373.m1931()) {
                            int i11 = f1326 + 11;
                            f1325 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 73 / 0;
                                if (s.m3035().m3059()) {
                                    cn.m1711(m1643(), str);
                                }
                            } else if (s.m3035().m3059()) {
                                cn.m1711(m1643(), str);
                            }
                            dzVarM2375.m2113(this.f1341, this, list);
                            return;
                        }
                        return;
                    }
                    dhVarM2373.m1930();
                    throw null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m1629(21 - Color.argb(0, 0, 0, 0), false, 224 - KeyEvent.normalizeMetaState(0), "\u0002\u000f\u0005\r\n\u000f\b\uffc1\u0006\u0017\u0006\u000f\u0015\uffc1￦\u0013\u0013\u0010\u0013\uffc1\t", TextUtils.getOffsetBefore("", 0) + 14).intern());
                sb2.append(str);
                new dt(this, strM1929, sb2.toString()).m2034(m1643());
            }
        } catch (Throwable th2) {
            String strM1643 = m1643();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m1629(ExpandableListView.getPackedPositionChild(0L) + 22, false, 225 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0002\u000f\u0005\r\n\u000f\b\uffc1\u0006\u0017\u0006\u000f\u0015\uffc1￦\u0013\u0013\u0010\u0013\uffc1\t", 14 - Color.blue(0)).intern());
            sb3.append(str);
            cn.m1708(strM1643, sb3.toString(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[Catch: JSONException -> 0x00a1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00a1, blocks: (B:20:0x008f, B:13:0x0030), top: B:28:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0082  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b A[PHI: r0
  0x008b: PHI (r0v7 java.lang.Object) = (r0v3 java.lang.Object), (r0v11 java.lang.Object) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x008f A[Catch: JSONException -> 0x00a1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00a1, blocks: (B:20:0x008f, B:13:0x0030), top: B:28:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0022 A[PHI: r0
  0x0022: PHI (r0v4 java.lang.Object) = (r0v3 java.lang.Object), (r0v11 java.lang.Object) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m1618(JSONObject jSONObject, String str) {
        Object objOpt;
        String str2;
        String strM1622;
        int i10 = f1325 + 7;
        f1326 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                objOpt = jSONObject.opt(str);
                int i11 = 86 / 0;
                if (objOpt instanceof String) {
                    str2 = (String) objOpt;
                    if (m1606(str2)) {
                        strM1622 = m1622(str2);
                        if (strM1622 != null) {
                            jSONObject.put(str, strM1622);
                        } else {
                            String strM1643 = m1643();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m1629((ViewConfiguration.getLongPressTimeout() >> 16) + 6, false, 218 - KeyEvent.keyCodeFromString(""), "\u001aￇ￪\u0013\b\u001a", 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                            sb2.append(str2);
                            sb2.append(m1623((String) null, TextUtils.lastIndexOf("", '0') + 128, (int[]) null, "\u0096\u0098\u0085\u0082\u008a\u0099\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u008f\u0099§\u008b\u0089\u0085\u008c\u0084¦\u008e\u0099¥\u0099\u0087\u008b\u0098\u0084\u0095\u0099\u0085\u0084\u008b\u0099").intern());
                            cn.m1711(strM1643, sb2.toString());
                            return false;
                        }
                    } else {
                        f1326 = (f1325 + InterfaceC0435l1.d.b.f29112i) % 128;
                    }
                } else if (objOpt instanceof JSONArray) {
                    jSONObject.put(str, new JSONArray((Collection) m1613(kj.m2858((JSONArray) objOpt))));
                }
            } else {
                objOpt = jSONObject.opt(str);
                if (objOpt instanceof String) {
                    str2 = (String) objOpt;
                    if (m1606(str2)) {
                        strM1622 = m1622(str2);
                        if (strM1622 != null) {
                            jSONObject.put(str, strM1622);
                        } else {
                            String strM1644 = m1643();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m1629((ViewConfiguration.getLongPressTimeout() >> 16) + 6, false, 218 - KeyEvent.keyCodeFromString(""), "\u001aￇ￪\u0013\b\u001a", 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                            sb3.append(str2);
                            sb3.append(m1623((String) null, TextUtils.lastIndexOf("", '0') + 128, (int[]) null, "\u0096\u0098\u0085\u0082\u008a\u0099\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u008f\u0099§\u008b\u0089\u0085\u008c\u0084¦\u008e\u0099¥\u0099\u0087\u008b\u0098\u0084\u0095\u0099\u0085\u0084\u008b\u0099").intern());
                            cn.m1711(strM1644, sb3.toString());
                            return false;
                        }
                    } else {
                        f1326 = (f1325 + InterfaceC0435l1.d.b.f29112i) % 128;
                    }
                } else if (objOpt instanceof JSONArray) {
                    jSONObject.put(str, new JSONArray((Collection) m1613(kj.m2858((JSONArray) objOpt))));
                }
            }
        } catch (JSONException unused) {
        }
        int i12 = f1325 + 107;
        f1326 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1628(JSONObject jSONObject, q qVar, q qVar2, jc jcVar) {
        int i10 = f1326 + 45;
        f1325 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1334.m3088(jSONObject, m1610(qVar, qVar2), jcVar);
            throw null;
        }
        this.f1334.m3088(jSONObject, m1610(qVar, qVar2), jcVar);
        int i11 = f1325 + 7;
        f1326 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1624(String str, JSONObject jSONObject) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1655966961) {
            if (iHashCode != -787751952) {
                if (iHashCode == 3619493 && str.equals(m1629(View.resolveSizeAndState(0, 0, 0) + 4, true, 239 - View.getDefaultSize(0, 0), "\b\t\ufff7\ufffb", Color.green(0) + 1).intern())) {
                    f1326 = (f1325 + 59) % 128;
                    return jSONObject.optString(m1623((String) null, 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), (int[]) null, "\u0082\u0083\u008e\u009a\u008a\u008a\u008e\u008f\u009d\u009c\u0082\u0089\u009b\u0087\u008e").intern(), null);
                }
            } else if (str.equals(m1629((Process.myPid() >> 22) + 6, true, View.MeasureSpec.getSize(0) + 239, "\ufff6\u0000\ufffb\t\t\u0001", Color.argb(0, 0, 0, 0) + 4).intern())) {
                f1325 = (f1326 + 85) % 128;
                return jSONObject.optString(m1629(13 - View.MeasureSpec.makeMeasureSpec(0, 0), true, (ViewConfiguration.getEdgeSlop() >> 16) + 231, "\uffff\u0003\u0010\uffff\u0007\ufffb￨\r\r\ufffb\u0006\uffdd\u0011", View.MeasureSpec.getMode(0) + 3).intern(), null);
            }
        } else if (str.equals(m1629((ViewConfiguration.getWindowTouchSlop() >> 8) + 8, false, 238 - KeyEvent.getDeadChar(0, 0), "\ufff6\u0007￼\t￼\u0007\f\ufff4", 7 - Color.blue(0)).intern())) {
            f1325 = (f1326 + InterfaceC0435l1.d.b.f29112i) % 128;
            return jSONObject.optString(m1623((String) null, 127 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (int[]) null, "\u0082\u0083\u008e\u009a\u0094\u0085\u0089\u0093\u0089\u0085\u0092\u0086\u0087\u008e").intern(), null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1635(JSONObject jSONObject, v vVar, v vVar2) {
        f1325 = (f1326 + 99) % 128;
        this.f1334.m3085(jSONObject, m1621(vVar, vVar2));
        f1325 = (f1326 + 97) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1634(JSONObject jSONObject, q qVar, q qVar2) {
        int i10 = f1325 + 73;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f1334.m3083(jSONObject, m1610(qVar, qVar2));
            throw null;
        }
        this.f1334.m3083(jSONObject, m1610(qVar, qVar2));
        int i11 = f1326 + 19;
        f1325 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m1636(Activity activity, List<String> list) {
        int i10 = f1325 + 99;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            return true;
        }
        f1325 = (f1326 + 9) % 128;
        if (list.contains(activity.getClass().getName())) {
            return true;
        }
        int i11 = f1325 + 117;
        f1326 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 14 / 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1629(int i10, boolean z10, int i11, String str, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1625) {
            try {
                char[] cArr2 = new char[i10];
                com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                while (true) {
                    int i13 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                    if (i13 >= i10) {
                        break;
                    }
                    com.ironsource.adqualitysdk.sdk.i.d.f1624 = cArr[i13];
                    cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1622] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1624 + i11);
                    int i14 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                    cArr2[i14] = (char) (cArr2[i14] - f1331);
                    com.ironsource.adqualitysdk.sdk.i.d.f1622 = i14 + 1;
                }
                if (i12 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1623 = i12;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = com.ironsource.adqualitysdk.sdk.i.d.f1623;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    com.ironsource.adqualitysdk.sdk.i.d.f1622 = 0;
                    while (true) {
                        int i17 = com.ironsource.adqualitysdk.sdk.i.d.f1622;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        com.ironsource.adqualitysdk.sdk.i.d.f1622 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1601(final iy iyVar, boolean z10) {
        int i10 = f1325 + InterfaceC0435l1.d.b.f29110g;
        f1326 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                throw null;
            }
            if (z10) {
                p.m2994(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        p.m2996(iyVar);
                    }
                });
                int i11 = f1326 + 11;
                f1325 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                return;
            }
            p.m2996(iyVar);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private JSONObject m1625(JSONObject jSONObject) {
        dp dpVarM1598;
        String strOptString = jSONObject.optString(m1623((String) null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, (int[]) null, " \u0089\u0095\u0082\u008c\u009f\u008a\u009e").intern());
        jSONObject.remove(m1623((String) null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, (int[]) null, " \u0089\u0095\u0082\u008c\u009f\u008a\u009e").intern());
        if (jSONObject.optBoolean(m1623((String) null, Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u008a¡\u0085\u0092\u0082\u009e\u008b\u0089").intern()) && (dpVarM1598 = m1598()) != null) {
            if (!TextUtils.isEmpty(dpVarM1598.m2039())) {
                jSONObject.remove(m1623((String) null, ImageFormat.getBitsPerPixel(0) + 128, (int[]) null, "\u008a¡\u0085\u0092\u0082\u009e\u008b\u0089").intern());
                try {
                    String strIntern = m1623((String) null, Color.alpha(0) + 127, (int[]) null, "\u0085\u0092\u0082\u009e\u008b£\u0084¢\u008a\u009e").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strOptString);
                    sb2.append(dpVarM1598.m2039());
                    jSONObject.put(strIntern, sb2.toString());
                } catch (JSONException unused) {
                }
            }
            if (dpVarM1598.m2041()) {
                f1326 = (f1325 + 43) % 128;
                try {
                    jSONObject.put(m1623((String) null, 127 - Drawable.resolveOpacity(0, 0), (int[]) null, "\u008a¡\u008e\u008c\u0085 ¤\u0082\u008a\u0098").intern(), true);
                } catch (JSONException unused2) {
                }
            }
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            f1325 = (f1326 + 71) % 128;
            if (!m1618(jSONObject, itKeys.next())) {
                return null;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m1613(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (m1606(str)) {
                String strM1622 = m1622(str);
                if (strM1622 != null) {
                    arrayList.add(strM1622);
                    f1325 = (f1326 + 59) % 128;
                }
            } else {
                arrayList.add(str);
                f1326 = (f1325 + 23) % 128;
            }
        }
        int i10 = f1326 + 81;
        f1325 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 66 / 0;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private q m1612(final boolean z10) {
        q qVar = new q() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.13

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1362 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int[] f1363 = {797893669, -129654297, 1328694585, -844638046, 272018886, 499355616, -1782812695, -323544516, 951103988, 164402079, 720967302, -1662926282, 507421653, -719118971, -1377044474, -1978897695, -967019884, -1616632234};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1364;

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo246(JSONObject jSONObject, View view, Activity activity) {
                f1362 = (f1364 + 49) % 128;
                mo246(jSONObject, view, activity);
                int i10 = f1364 + 61;
                f1362 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ void mo248(JSONObject jSONObject, View view, Activity activity) {
                f1364 = (f1362 + 29) % 128;
                mo248(jSONObject, view, activity);
                f1364 = (f1362 + 123) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo249(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1362 + 91;
                f1364 = i10 % 128;
                int i11 = i10 % 2;
                mo249(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ void mo251(JSONObject jSONObject, View view, Activity activity) {
                f1362 = (f1364 + 67) % 128;
                mo251(jSONObject, view, activity);
                f1362 = (f1364 + 51) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo252(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1362 + 77;
                f1364 = i10 % 128;
                int i11 = i10 % 2;
                mo252(jSONObject, view, activity);
                if (i11 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﻐ */
            public final /* synthetic */ void mo247(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1364 + InterfaceC0435l1.d.b.f29107d;
                f1362 = i10 % 128;
                int i11 = i10 % 2;
                mo247(jSONObject, view, obj, activity);
                if (i11 == 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo250(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1362 + 121;
                f1364 = i10 % 128;
                if (i10 % 2 != 0) {
                    m1676(m1675(new int[]{-226545538, 2095782002, -1727207343, 409626914, -1366058482, -1548451407}, 9 >> (ViewConfiguration.getMinimumFlingVelocity() % 62)).intern(), jSONObject, view, obj, activity);
                } else {
                    m1676(m1675(new int[]{-226545538, 2095782002, -1727207343, 409626914, -1366058482, -1548451407}, 9 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), jSONObject, view, obj, activity);
                }
                int i11 = f1362 + 67;
                f1364 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ｋ */
            public final /* synthetic */ void mo250(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1364 + 93;
                f1362 = i10 % 128;
                int i11 = i10 % 2;
                mo250(jSONObject, view, obj, activity);
                if (i11 == 0) {
                    throw null;
                }
                int i12 = f1362 + 33;
                f1364 = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo253(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1364 = (f1362 + 57) % 128;
                m1676(m1675(new int[]{1420922140, -1291994676, -1804502943, -1819155862, -1383974832, 2090661715, 1721694308, -678330104, 1799733033, 939715536}, 19 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), jSONObject, view, obj, activity);
                f1364 = (f1362 + 59) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.q, com.ironsource.adqualitysdk.sdk.i.t
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ void mo253(JSONObject jSONObject, View view, Object obj, Activity activity) {
                int i10 = f1362 + 67;
                f1364 = i10 % 128;
                int i11 = i10 % 2;
                mo253(jSONObject, view, obj, activity);
                if (i11 != 0) {
                    throw null;
                }
                f1364 = (f1362 + 41) % 128;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo248(JSONObject jSONObject, View view, Activity activity) {
                f1364 = (f1362 + 53) % 128;
                m1676(m1675(new int[]{-226545538, 2095782002, -984131835, -997814949}, 8 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), jSONObject, view, null, activity);
                int i10 = f1364 + 65;
                f1362 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 86 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo251(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1364 + 93;
                f1362 = i10 % 128;
                if (i10 % 2 == 0) {
                    m1676(m1675(new int[]{1943555526, 1771251122, -960699496, 611815510, 640645146, 1729154342}, 84 >>> (TypedValue.complexToFraction(1, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > 2.0f ? 1 : (TypedValue.complexToFraction(1, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 2.0f ? 0 : -1))).intern(), jSONObject, view, null, activity);
                } else {
                    m1676(m1675(new int[]{1943555526, 1771251122, -960699496, 611815510, 640645146, 1729154342}, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 12).intern(), jSONObject, view, null, activity);
                }
                int i11 = f1364 + 45;
                f1362 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo246(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1362 + 15;
                f1364 = i10 % 128;
                if (i10 % 2 != 0) {
                    m1676(m1675(new int[]{354189052, -2111251030, -391662391, -1754159239, 1635758796, 2088182675, 863286248, 1506006629}, 22 << Color.blue(0)).intern(), jSONObject, view, null, activity);
                } else {
                    m1676(m1675(new int[]{354189052, -2111251030, -391662391, -1754159239, 1635758796, 2088182675, 863286248, 1506006629}, Color.blue(0) + 16).intern(), jSONObject, view, null, activity);
                }
                int i11 = f1362 + 85;
                f1364 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo252(JSONObject jSONObject, View view, Activity activity) {
                f1362 = (f1364 + 45) % 128;
                m1676(m1675(new int[]{759918522, -2013881012, 758725621, 921637035, 344729405, -976580815}, View.MeasureSpec.makeMeasureSpec(0, 0) + 11).intern(), jSONObject, view, null, activity);
                int i10 = f1362 + 35;
                f1364 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 40 / 0;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo249(JSONObject jSONObject, View view, Activity activity) {
                int i10 = f1364 + 83;
                f1362 = i10 % 128;
                if (i10 % 2 == 0) {
                    m1676(m1675(new int[]{354189052, -2111251030, -391662391, -1754159239, 1656513515, 2098796337}, 119 >> (Process.myTid() / 36)).intern(), jSONObject, view, null, activity);
                } else {
                    m1676(m1675(new int[]{354189052, -2111251030, -391662391, -1754159239, 1656513515, 2098796337}, (Process.myTid() >> 22) + 11).intern(), jSONObject, view, null, activity);
                }
                f1364 = (f1362 + 3) % 128;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m1676(String str, JSONObject jSONObject, View view, Object obj, Activity activity) {
                cl.m1615(cl.this, f2.k(m1675(new int[]{-394966916, 997166518, 509359631, 918240162, -13412473, -223311310, -221071911, 1048957571}, Drawable.resolveOpacity(0, 0) + 15), str, new StringBuilder()), z10, false, Arrays.asList(jSONObject, view, obj, activity));
                int i10 = f1364 + 115;
                f1362 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.ironsource.adqualitysdk.sdk.i.q
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo247(JSONObject jSONObject, View view, Object obj, Activity activity) {
                f1364 = (f1362 + 25) % 128;
                m1676(m1675(new int[]{-226545538, 2095782002, -1727207343, 409626914, -492986523, 498244027, 699517167, 1425143628}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14).intern(), jSONObject, view, obj, activity);
                int i10 = f1362 + 41;
                f1364 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m1675(int[] iArr, int i10) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.a.f61) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f1363.clone();
                        com.ironsource.adqualitysdk.sdk.i.a.f58 = 0;
                        while (true) {
                            int i11 = com.ironsource.adqualitysdk.sdk.i.a.f58;
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
                                com.ironsource.adqualitysdk.sdk.i.a.f59 = (c4 << 16) + c5;
                                com.ironsource.adqualitysdk.sdk.i.a.f60 = (c10 << 16) + c11;
                                com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                                for (int i13 = 0; i13 < 16; i13++) {
                                    int i14 = com.ironsource.adqualitysdk.sdk.i.a.f59 ^ iArr2[i13];
                                    com.ironsource.adqualitysdk.sdk.i.a.f59 = i14;
                                    int iM200 = com.ironsource.adqualitysdk.sdk.i.a.m200(i14) ^ com.ironsource.adqualitysdk.sdk.i.a.f60;
                                    int i15 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                                    com.ironsource.adqualitysdk.sdk.i.a.f59 = iM200;
                                    com.ironsource.adqualitysdk.sdk.i.a.f60 = i15;
                                }
                                int i16 = com.ironsource.adqualitysdk.sdk.i.a.f59;
                                int i17 = com.ironsource.adqualitysdk.sdk.i.a.f60;
                                com.ironsource.adqualitysdk.sdk.i.a.f59 = i17;
                                com.ironsource.adqualitysdk.sdk.i.a.f60 = i16;
                                int i18 = i16 ^ iArr2[16];
                                com.ironsource.adqualitysdk.sdk.i.a.f60 = i18;
                                int i19 = i17 ^ iArr2[17];
                                com.ironsource.adqualitysdk.sdk.i.a.f59 = i19;
                                cArr[0] = (char) (i19 >>> 16);
                                cArr[1] = (char) i19;
                                cArr[2] = (char) (i18 >>> 16);
                                cArr[3] = (char) i18;
                                com.ironsource.adqualitysdk.sdk.i.a.m199(iArr2);
                                int i20 = com.ironsource.adqualitysdk.sdk.i.a.f58;
                                cArr2[i20 << 1] = cArr[0];
                                cArr2[(i20 << 1) + 1] = cArr[1];
                                cArr2[(i20 << 1) + 2] = cArr[2];
                                cArr2[(i20 << 1) + 3] = cArr[3];
                                com.ironsource.adqualitysdk.sdk.i.a.f58 = i20 + 2;
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
        };
        f1326 = (f1325 + InterfaceC0435l1.d.b.f29109f) % 128;
        return qVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private JSONObject m1614(Activity activity, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(is.f2612, m1651().m1737());
            jSONObject.put(is.f2566, m1651().m1738());
            jSONObject.put(is.f2563, m1651().m1734());
            jSONObject.put(m1629(ExpandableListView.getPackedPositionGroup(0L) + 7, false, 227 - ExpandableListView.getPackedPositionChild(0L), "\ufffe\n\u0002\ufffe\u0000\u0011￫", KeyEvent.normalizeMetaState(0) + 3).intern(), activity.getClass().getName());
            if (bundle != null) {
                f1325 = (f1326 + 115) % 128;
                jSONObject.put(m1629(8 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), true, 232 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\ufffe\r\ufffa\r￬\r￼\ufffa", 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), true);
            }
        } catch (JSONException unused) {
            m.m2972(m1623((String) null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, (int[]) null, "\u008c\u0082\u008b\u0082\u0085\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m1623((String) null, View.MeasureSpec.makeMeasureSpec(0, 0) + 127, (int[]) null, "\u0085\u0092\u0082\u009e¦\u0084\u0099\u008b\u0084\u008a\u009e\u0099\u0085\u0092\u008e\u0099§\u008b\u0089\u0085\u008e\u0082\u008c\u0092\u0099\u008c\u0084\u008c\u008c¤").intern());
        }
        f1325 = (f1326 + 115) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1622(String str) {
        Class clsM816;
        int i10 = f1325 + 23;
        f1326 = i10 % 128;
        if (i10 % 2 != 0 ? (clsM816 = m1640().m816(kn.m2921(str, m1623((String) null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, (int[]) null, "\u008a\u008a\u008e\u008f\u0092\u008d").intern()))) == null : (clsM816 = m1640().m816(kn.m2921(str, m1623((String) null, 42 / (ViewConfiguration.getDoubleTapTimeout() << 97), (int[]) null, "\u008a\u008a\u008e\u008f\u0092\u008d").intern()))) == null) {
            return null;
        }
        f1326 = (f1325 + 3) % 128;
        return clsM816.getName();
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private l m1620(final l lVar, final l lVar2) {
        int i10 = f1325 + InterfaceC0435l1.d.b.f29110g;
        f1326 = i10 % 128;
        if (i10 % 2 != 0) {
            if (lVar == null) {
                lVar = new l();
                f1325 = (f1326 + 27) % 128;
            }
            if (lVar2 == null) {
                lVar2 = new l();
            }
            return new l() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                public final void mo246(JSONObject jSONObject, WebView webView, Activity activity) {
                    lVar2.mo246(jSONObject, webView, activity);
                    p.m3001(new e.AnonymousClass5(lVar, jSONObject, webView, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                public final void mo249(JSONObject jSONObject, WebView webView, Activity activity) {
                    lVar2.mo249(jSONObject, webView, activity);
                    p.m3001(new c.AnonymousClass5(lVar, jSONObject, webView, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo250(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                    lVar2.mo250(jSONObject, webView, obj, activity);
                    p.m3001(new b.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo247(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                    lVar2.mo247(jSONObject, webView, obj, activity);
                    p.m3001(new d.AnonymousClass2(lVar, jSONObject, webView, obj, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo251(JSONObject jSONObject, WebView webView, Activity activity) {
                    lVar2.mo251(jSONObject, webView, activity);
                    p.m3001(new g.AnonymousClass4(lVar, jSONObject, webView, activity));
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                public final void mo253(JSONObject jSONObject, WebView webView, Object obj, Activity activity) {
                    lVar2.mo253(jSONObject, webView, obj, activity);
                    p.m3001(new f.AnonymousClass5(lVar, jSONObject, webView, obj, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo252(JSONObject jSONObject, WebView webView, Activity activity) {
                    lVar2.mo252(jSONObject, webView, activity);
                    p.m3001(new h.AnonymousClass1(lVar, jSONObject, webView, activity));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.l, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo248(JSONObject jSONObject, WebView webView, Activity activity) {
                    lVar2.mo248(jSONObject, webView, activity);
                    p.m3001(new a.AnonymousClass4(lVar, jSONObject, webView, activity));
                }
            };
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1617(final String str, final List<Object> list) {
        p.m3001(new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                cl.m1615(cl.this, str, false, false, list);
            }
        });
        p.m2998(new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.9
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                cl.m1615(cl.this, str, true, false, list);
            }
        });
        m1601(new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.7
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                cl.m1615(cl.this, str, false, true, list);
            }
        }, true);
        int i10 = f1325 + InterfaceC0435l1.d.b.f29109f;
        f1326 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 55 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private v m1621(final v vVar, final v vVar2) {
        int i10 = f1326 + InterfaceC0435l1.d.b.f29112i;
        f1325 = i10 % 128;
        if (i10 % 2 == 0) {
            if (vVar == null) {
                vVar = new v();
                f1325 = (f1326 + 17) % 128;
            }
            if (vVar2 == null) {
                vVar2 = new v();
            }
            return new v() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﻛ */
                public final void mo252(JSONObject jSONObject, WebView webView, View view) {
                    vVar2.mo252(jSONObject, webView, view);
                    p.m3001(new h.AnonymousClass1(vVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﾇ */
                public final void mo246(JSONObject jSONObject, WebView webView, View view) {
                    vVar2.mo246(jSONObject, webView, view);
                    p.m3001(new e.AnonymousClass5(vVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﻐ */
                public final void mo248(JSONObject jSONObject, WebView webView, View view) {
                    vVar2.mo248(jSONObject, webView, view);
                    p.m3001(new a.AnonymousClass4(vVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ｋ */
                public final void mo249(JSONObject jSONObject, WebView webView, View view) {
                    vVar2.mo249(jSONObject, webView, view);
                    p.m3001(new c.AnonymousClass5(vVar, jSONObject, webView, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﾒ */
                public final void mo247(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    vVar2.mo247(jSONObject, webView, obj, view);
                    p.m3001(new d.AnonymousClass2(vVar, jSONObject, webView, obj, view));
                }

                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﾇ */
                public final void mo250(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    vVar2.mo250(jSONObject, webView, obj, view);
                    p.m3001(new b.AnonymousClass2(vVar, jSONObject, webView, obj, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ｋ */
                public final void mo253(JSONObject jSONObject, WebView webView, Object obj, View view) {
                    vVar2.mo253(jSONObject, webView, obj, view);
                    p.m3001(new f.AnonymousClass5(vVar, jSONObject, webView, obj, view));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.ironsource.adqualitysdk.sdk.i.v, com.ironsource.adqualitysdk.sdk.i.t
                /* JADX INFO: renamed from: ﾒ */
                public final void mo251(JSONObject jSONObject, WebView webView, View view) {
                    vVar2.mo251(jSONObject, webView, view);
                    p.m3001(new g.AnonymousClass4(vVar, jSONObject, webView, view));
                }
            };
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jx m1619(final List<String> list) {
        jx jxVar = new jx() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.4

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static byte[] f1387 = {14, 11, 44, -42, -15, 29, -5, 38, -41, -16, 112, 124, -116, 116, -114, -127, -100, 80, 113, -99, 123, -90, 87, 112, 14, -65, 69, -69, 67, -77, -72, -81, 107, 76, -96, 70, -101, 100, -78, -99, 0, 0, 0};

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static short[] f1388 = null;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f1389 = 1;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1390 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1391 = -1315880136;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1392 = -187770579;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f1393 = 95;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private void m1687(String str, final Activity activity, List<String> list2) {
                f1389 = (f1390 + 13) % 128;
                if (cl.m1604(activity, list2)) {
                    final String strK = f2.k(m1688((short) View.MeasureSpec.getSize(0), 187770644 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.combineMeasuredStates(0, 0) - 78, 1315880160 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (Color.blue(0) - 78)), str, new StringBuilder());
                    cl.m1615(cl.this, strK, true, false, Collections.singletonList(activity));
                    p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cl.4.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            cl.m1615(cl.this, strK, false, false, Collections.singletonList(activity));
                        }
                    });
                    f1389 = (f1390 + 29) % 128;
                }
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m1688(short s10, int i10, int i11, int i12, byte b10) {
                String string;
                synchronized (n.f3070) {
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f1393;
                        int i14 = i11 + i13;
                        int i15 = i14 == -1 ? 1 : 0;
                        if (i15 != 0) {
                            byte[] bArr = f1387;
                            i14 = bArr != null ? (byte) (bArr[f1391 + i12] + i13) : (short) (f1388[f1391 + i12] + i13);
                        }
                        if (i14 > 0) {
                            n.f3072 = ((i12 + i14) - 2) + f1391 + i15;
                            n.f3073 = b10;
                            char c4 = (char) (i10 + f1392);
                            n.f3074 = c4;
                            sb2.append(c4);
                            n.f3075 = n.f3074;
                            n.f3071 = 1;
                            while (n.f3071 < i14) {
                                byte[] bArr2 = f1387;
                                if (bArr2 != null) {
                                    int i16 = n.f3072;
                                    n.f3072 = i16 - 1;
                                    n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                                } else {
                                    short[] sArr = f1388;
                                    int i17 = n.f3072;
                                    n.f3072 = i17 - 1;
                                    n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                                }
                                sb2.append(n.f3074);
                                n.f3075 = n.f3074;
                                n.f3071++;
                            }
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* JADX INFO: renamed from: ﻐ */
            public final void mo392(Activity activity) {
                f1389 = (f1390 + 55) % 128;
                m1687(m1688((short) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 187770690, (-79) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 1315880146, (byte) ((-113) - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), activity, list);
                f1389 = (f1390 + 31) % 128;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jx
            /* JADX INFO: renamed from: ｋ */
            public final void mo393(Activity activity) {
                f1390 = (f1389 + InterfaceC0435l1.d.b.f29112i) % 128;
                m1687(m1688((short) TextUtils.getCapsMode("", 0, 0), 187770690 - (ViewConfiguration.getScrollBarSize() >> 8), (-84) - TextUtils.indexOf("", "", 0), 1315880135 - MotionEvent.axisFromString(""), (byte) (14 - TextUtils.indexOf((CharSequence) "", '0'))).intern(), activity, list);
                int i10 = f1390 + 79;
                f1389 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 42 / 0;
                }
            }
        };
        int i10 = f1325 + 65;
        f1326 = i10 % 128;
        if (i10 % 2 != 0) {
            return jxVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1623(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f1327;
                int i11 = f1328;
                if (f1329) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f1330) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
