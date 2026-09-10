package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4312pT implements FB {
    public static final C4312pT n = new C4312pT();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4835a = C4312pT.class.getSimpleName();
    public final String b;
    public final ArrayList c;
    public final AtomicInteger d;
    public boolean e;
    public final ArrayMap f;
    public final ArrayMap g;
    public final ArrayMap h;
    public String i;
    public final HashSet j;
    public C4400qT k;
    public int l;
    public int m;

    public C4312pT() {
        byte[] bArr = {-17, 36, 11, -33, -47, -107, -53, 86, -1, 36, 11};
        byte[] bArr2 = {-116, 75, 101, -71, -72, -14, -108, 60};
        int i = 0;
        int i2 = 0;
        while (i < 11) {
            if (i2 >= 8) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        this.b = new String(bArr, StandardCharsets.UTF_8);
        this.c = new ArrayList();
        this.d = new AtomicInteger(-1);
        this.e = false;
        this.f = new ArrayMap();
        this.g = new ArrayMap();
        this.h = new ArrayMap();
        this.i = "";
        this.j = new HashSet();
        this.k = null;
        this.l = -1;
        this.m = -1;
    }

    public static String e(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return "";
        }
        Object tag = viewGroup.getTag();
        if (tag == null || tag.equals("")) {
            viewGroup.setTag(UUID.randomUUID().toString());
        }
        return viewGroup.getTag().toString();
    }

    public static boolean k(ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && (childAt.getTag() instanceof Integer) && childAt.getTag().equals(C4663tT.s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean l(String str) {
        try {
            String strP = p(str);
            String absolutePath = C3044b1.b.j().getExternalCacheDir().getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(absolutePath);
            sb.append(File.separator);
            byte[] bArr = {124, 117, -65, 55, -16, -46, 92, -31};
            byte[] bArr2 = {24, 5, -53, 116, -111, -79, 52, -124};
            int i = 0;
            int i2 = 0;
            while (i < 8) {
                if (i2 >= 8) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            sb.append(new String(bArr, StandardCharsets.UTF_8));
            return new File(new File(sb.toString()), strP).exists();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static C3784jT n(JSONObject jSONObject, AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        C3784jT c3784jT = new C3784jT();
        C3844k50 c3844k50 = c3784jT.h;
        try {
            c3784jT.f4554a = jSONObject.optBoolean(Qm0.D(new byte[]{-48, -94, -26, -47, -75, -90, 123}, new byte[]{-71, -47, -95, -127, -12, -42, 11, -7}), true);
            c3784jT.b = jSONObject.optString(Qm0.D(new byte[]{20, 97, -128, com.umeng.analytics.pro.cw.n, 53, -116, 9, 26, 7, 105}, new byte[]{117, 5, -51, 117, 81, -27, 104, 79}));
            c3784jT.d = jSONObject.optString(Qm0.D(new byte[]{-74, 22, -109, -11, -53, 2, -3, 70}, new byte[]{-43, 122, -6, -106, -96, 87, -113, 42}));
            c3784jT.c = jSONObject.optString(Qm0.D(new byte[]{-18, -128, -41, -12, 116, 41, -113}, new byte[]{-121, -29, -72, -102, 33, 91, -29, 77}));
            c3784jT.e = jSONObject.optString(Qm0.D(new byte[]{-80, 59, -31}, new byte[]{-59, 79, -116, 62, -6, -93, 67, -102}));
            c3784jT.f = jSONObject.optBoolean(Qm0.D(new byte[]{116, -76, 94}, new byte[]{17, -38, 61, 95, 57, 81, -17, -80}), true);
            c3784jT.g = jSONObject.optInt(Qm0.D(new byte[]{28, 20, -88, 70, 68, 74, 25, -58}, new byte[]{108, 102, -63, 41, 54, 35, 109, -65}), 0);
            String language = abstractApplicationC2673Ph.getResources().getConfiguration().locale.getLanguage();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(Qm0.D(new byte[]{36, -4, -13, 127}, new byte[]{64, -103, -128, 28, -70, 26, -32, 67}));
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(0);
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.getJSONObject(i).optString(Qm0.D(new byte[]{114, 0, 37, 116}, new byte[]{30, 97, 75, 19, 109, 97, 121, 107}));
                    if (strOptString.equalsIgnoreCase(Qm0.D(new byte[]{51, 33}, new byte[]{86, 79, 77, -30, -1, 84, -51, 18}))) {
                        jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    }
                    if (strOptString.equalsIgnoreCase(language)) {
                        jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                        break;
                    }
                }
                c3844k50.b = jSONObject2.optString(Qm0.D(new byte[]{-20, -62, -17, 11}, new byte[]{-128, -93, -127, 108, 54, 28, -49, -121}));
                c3844k50.c = jSONObject2.optString(Qm0.D(new byte[]{55, -18, 107, -88, -35, 113, 54, 120}, new byte[]{95, -117, 10, -52, -79, 24, 88, 29}));
                c3844k50.d = jSONObject2.optString(Qm0.D(new byte[]{19, -62, -41, 94}, new byte[]{113, -83, -77, 39, 111, 3, com.umeng.analytics.pro.cw.m, -76}));
                c3844k50.e = jSONObject2.optString(Qm0.D(new byte[]{-8, -8, -30, -52, -113, -112, -66, 45, -17, -16, -31, -50}, new byte[]{-101, -103, -114, -96, -37, -1, -1, 78}));
            }
        } catch (Exception e) {
            e.printStackTrace();
            byte[] bArr = {-126, -89, -49, 7, -34, -37, -97, -2, -100, -78, -44, 0, -62, -70, -98, -55, -128, -87, -49, 78, -101};
            byte[] bArr2 = {-14, -58, -67, 116, -69, -102, -5, -69};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 21) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
        }
        return c3784jT;
    }

    public static C4400qT o(JSONObject jSONObject) {
        C4400qT c4400qT = new C4400qT();
        try {
            String strOptString = jSONObject.optString(Qm0.D(new byte[]{-125, -121, -120, -109, 23, 48, 82, -94, -100, -116, -127}, new byte[]{-13, -24, -28, -1, 126, 94, 53, -17}));
            if (!TextUtils.isEmpty(strOptString)) {
                c4400qT.f4882a = strOptString;
            }
            String strOptString2 = jSONObject.optString(Qm0.D(new byte[]{100, -13, 48, -5, 20, 115, 52, -57, 111, -2, 38, -54, 30, 102, 40, -8, 65, -10, 47, -54, 8, 98, 62, -61, 110, -23, 55, -22, 20, 126, 40, -18}, new byte[]{0, -102, 67, -117, 120, 18, 77, -118}));
            if (!TextUtils.isEmpty(strOptString2)) {
                c4400qT.b = strOptString2;
            }
            c4400qT.c = jSONObject.optBoolean(Qm0.D(new byte[]{-71, 101, 107, 38, -117, -122, 35, 124, -103, 117, 87, 32}, new byte[]{-48, 22, 56, 78, -28, -15, 98, 24}), true);
            String strOptString3 = jSONObject.optString(Qm0.D(new byte[]{63, -83, 46, -54, -7, 116, -32, 50, 46, -79, 43, -43, -60, 99, -9, 21}, new byte[]{79, -62, 66, -90, -112, 26, -121, 112}));
            if (!TextUtils.isEmpty(strOptString3)) {
                c4400qT.d = strOptString3;
            }
            long jOptLong = jSONObject.optLong(Qm0.D(new byte[]{51, -35, 29, 116, 28, 3, -55, -105, 40, -43, 30, 75, 42}, new byte[]{65, -72, 123, 6, 121, 112, -95, -61}), 0L);
            if (jOptLong > 0) {
                c4400qT.e = jOptLong;
            }
            c4400qT.f = jSONObject.optInt(Qm0.D(new byte[]{120, 120, 101, -44, -92, -120, 99, -72, 80, 125, 126, -33, -98, -96, 119, -83, 66, 111, 107, -56, -104, -94, 104, -88, 127, 111}, new byte[]{17, 27, 10, -70, -20, -31, 7, -35}), 0);
            c4400qT.g = jSONObject.optInt(Qm0.D(new byte[]{-17, 21, -36, -101, -69, -35, -127, -117, -57, com.umeng.analytics.pro.cw.n, -57, -112, -127, -28, -124, -119, -29, 37, -37, -102, -124, -9, -118, -101, -24, 2}, new byte[]{-122, 118, -77, -11, -13, -76, -27, -18}), 0);
            String strOptString4 = jSONObject.optString(Qm0.D(new byte[]{-29, -62, 71, 68, -90, -94, -108, 78, -52, -45, 77, 91, -128, -81, -107, 90, -13}, new byte[]{-118, -95, 40, 42, -11, -54, -5, 57}));
            if (!TextUtils.isEmpty(strOptString4)) {
                c4400qT.h = strOptString4;
            }
            c4400qT.i = jSONObject.optBoolean(Qm0.D(new byte[]{64, -116, -30, 51, 92, 4, -48, -36, 104, -119, -7, 56, 102, 46, -40, -48, 74, -124}, new byte[]{41, -17, -115, 93, 20, 109, -76, -71}), false);
            c4400qT.j = jSONObject.optBoolean(Qm0.D(new byte[]{6, 37, 111, 82, -66, -122, -103, -50, 12, 37, 72, 66, -73, -110, -91, -56, com.umeng.analytics.pro.cw.k, 40, 119, 115, -67, -115, -92, -33, 12, 39}, new byte[]{99, 75, com.umeng.analytics.pro.cw.l, 48, -46, -29, -48, -83}), false);
        } catch (Exception unused) {
            Qm0.D(new byte[]{-128, -92, -91, 26, -37, 106, 60, -52, -106, -84, -80, 47, -41, 76, 63, -58, -125, -27, -78, 27, -52, 70, 33, -104, -48}, new byte[]{-16, -59, -41, 105, -66, 41, 83, -94});
        }
        return c4400qT;
    }

    public static String p(String str) {
        String[] strArrSplit = Uri.parse(str).getPath().split(Qm0.D(new byte[]{52}, new byte[]{27, 64, -89, -81, 110, 85, 122, -126}));
        String str2 = strArrSplit[strArrSplit.length - 1];
        return Base64.encodeToString(str.getBytes(), 11) + Qm0.D(new byte[]{71}, new byte[]{105, -3, -115, 114, 119, -76, -65, 65}) + str2.substring(str2.lastIndexOf(Qm0.D(new byte[]{-80}, new byte[]{-98, 30, -6, -60, -101, -10, 63, 30})) + 1);
    }

    public final void a(ViewGroup viewGroup, List list, int i, GB gb) {
        C4663tT c4663tT;
        String strE = e(viewGroup);
        ArrayMap arrayMap = this.h;
        if (arrayMap.containsKey(strE)) {
            ((C4663tT) arrayMap.get(e(viewGroup))).n();
            arrayMap.remove(e(viewGroup));
        }
        C4400qT c4400qT = this.k;
        if (c4400qT != null) {
            Integer num = C4663tT.s;
            Qm0.D(new byte[]{69, -53, -7, -61, -121, -108, -2, 60, 84, -20, -31, -53, -106, -118, -78, 121, 119, -3, -34, -50, -105, -35, -1, 48, 97, -32, -105, -63, -100, -109, -18, 48, 114, -92, -105, -44, -102, -104, -1, 30, 103, -25, -62, -46, -45, -108, -5, 121, 123, -3, -37, -50, -52, -35}, new byte[]{21, -120, -73, -94, -13, -3, -120, 89});
            List list2 = c4400qT.k;
            if (list2 == null || list2.isEmpty()) {
                Qm0.D(new byte[]{-9, -7, 43, 121, -52, 6, -127, 70, -25, -74, 43, 106, -55, com.umeng.analytics.pro.cw.k, -127, 64, -26, -74, 45, 126, -42, 65, -49, 64, -76, -9, 33, 108}, new byte[]{-108, -106, 69, 31, -91, 97, -95, 47});
                c4663tT = new C4663tT(viewGroup, new ArrayList(), i, gb, null);
            } else {
                c4663tT = new C4663tT(viewGroup, c4400qT.k, i, gb, c4400qT);
            }
        } else {
            Integer num2 = C4663tT.s;
            byte[] bArr = {51, 108, 61, 1, -120, -108, 67, 36, 34, 75, 37, 9, -103, -118, com.umeng.analytics.pro.cw.m, 97, 1, 90, 26, 12, -104, -35, 21, 55, 10, 74, 4, 39, -114, -110, 64, 49, 67, 70, 0, 64, -110, -120, 89, 45, 92, com.umeng.analytics.pro.cw.m};
            byte[] bArr2 = {99, 47, 115, 96, -4, -3, 53, 65};
            int i2 = 0;
            int i3 = 0;
            while (i2 < 42) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            c4663tT = new C4663tT(viewGroup, list, i, gb, null);
        }
        arrayMap.put(e(viewGroup), c4663tT);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void b(ConstraintLayout constraintLayout) {
        C4663tT c4663tT;
        Handler handler;
        RunnableC4575sT runnableC4575sT;
        if (constraintLayout == null || constraintLayout.getTag() == null) {
            return;
        }
        String string = constraintLayout.getTag().toString();
        ArrayMap arrayMap = this.h;
        if (arrayMap.get(string) == null || (handler = (c4663tT = (C4663tT) arrayMap.get(string)).i) == null || (runnableC4575sT = c4663tT.j) == null) {
            return;
        }
        handler.removeCallbacks(runnableC4575sT);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void c(ConstraintLayout constraintLayout) {
        C4663tT c4663tT;
        List list;
        Handler handler;
        RunnableC4575sT runnableC4575sT;
        C3044b1 c3044b1 = C3044b1.b;
        if (!c3044b1.h()) {
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (constraintLayout == null || constraintLayout.getTag() == null) {
            return;
        }
        String string = constraintLayout.getTag().toString();
        if (!k(constraintLayout)) {
            m(constraintLayout, (KS) this.f.get(string));
            return;
        }
        ArrayMap arrayMap = this.h;
        if (arrayMap.get(string) == null || (list = (c4663tT = (C4663tT) arrayMap.get(string)).f5035a) == null || list.isEmpty() || (handler = c4663tT.i) == null || (runnableC4575sT = c4663tT.j) == null) {
            return;
        }
        n.getClass();
        handler.postDelayed(runnableC4575sT, c3044b1.d().d);
    }

    public final void h() {
        ArrayMap arrayMap = this.g;
        if (arrayMap == null || arrayMap.isEmpty()) {
            return;
        }
        AbstractC3950lJ.z(arrayMap.valueAt(arrayMap.size() - 1));
    }

    public final ArrayList i(String str, AbstractApplicationC2673Ph abstractApplicationC2673Ph) {
        JSONArray jSONArray;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has(Qm0.D(new byte[]{-53, -37, -75}, new byte[]{-86, -65, -58, 67, -84, 65, -38, -49}))) {
                        throw new Exception(Qm0.D(new byte[]{20, -61, 71, -66, 12, 29, 95, -83, 60, -61, 65, -13, 3, 12}, new byte[]{90, -84, 51, -98, 98, 120, 40, -115}));
                    }
                    Qm0.D(new byte[]{-125, 57, -36, 23, -29, 93, 23, -59, -123, 62, -37, 20, -75, 24, 59, -58, -113, 120, -44, 28, -3, 85, 53, -34, -53, 18, -31, 60, -63}, new byte[]{-21, 88, -78, 115, -113, 56, 84, -86});
                    jSONArray = jSONObject.getJSONArray(Qm0.D(new byte[]{-79, 21, 110}, new byte[]{-48, 113, 29, 119, -57, -57, 92, -29}));
                    this.k = o(jSONObject);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        C3784jT c3784jTN = n(jSONArray.getJSONObject(i), abstractApplicationC2673Ph);
                        if (!TextUtils.isEmpty(c3784jTN.d)) {
                            arrayList.add(c3784jTN);
                        }
                    }
                    C4400qT c4400qT = this.k;
                    if (c4400qT != null) {
                        c4400qT.k = arrayList;
                    }
                } catch (Exception unused) {
                    byte[] bArr = {-16, -41, -91, 54, -46, 118, 108, -111, -10, -48, -94, 53, -124, 51, 65, -101, -17, -106, -83, 61, -52, 126, 78, -118, -72, -4, -104, 29, -16};
                    byte[] bArr2 = {-104, -74, -53, 82, -66, 19, 47, -2};
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < 29) {
                        if (i3 >= 8) {
                            i3 = 0;
                        }
                        bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                        i2++;
                        i3++;
                    }
                    new String(bArr, StandardCharsets.UTF_8);
                    jSONArray = new JSONArray(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
                byte[] bArr3 = {47, 43, 29, 48, 104, 109, -126, -125, 41, 44, 26, 51, 62, 40};
                byte[] bArr4 = {71, 74, 115, 84, 4, 8, -63, -20};
                int i4 = 0;
                int i5 = 0;
                while (i4 < 14) {
                    if (i5 >= 8) {
                        i5 = 0;
                    }
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr4[i5]);
                    i4++;
                    i5++;
                }
                new String(bArr3, StandardCharsets.UTF_8);
            }
        }
        return arrayList;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FB
    public final void j(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getTag() == null) {
            return;
        }
        String string = viewGroup.getTag().toString();
        ArrayMap arrayMap = this.g;
        if (arrayMap.get(string) != null) {
            AbstractC3950lJ.z(arrayMap.get(string));
            throw null;
        }
        this.f.remove(string);
        arrayMap.remove(string);
        ArrayMap arrayMap2 = this.h;
        if (arrayMap2.get(string) != null) {
            ((C4663tT) arrayMap2.get(string)).n();
        }
        arrayMap2.remove(string);
    }

    public final void m(ViewGroup viewGroup, KS ks) {
        int i = 25;
        C3044b1 c3044b1 = C3044b1.b;
        if (!c3044b1.h()) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            h();
            return;
        }
        if (c3044b1.b() == 2 || viewGroup == null) {
            return;
        }
        WeakReference weakReference = new WeakReference(viewGroup);
        String strE = e(viewGroup);
        if (k(viewGroup)) {
            return;
        }
        if (viewGroup.getTag() != null) {
            this.i = strE;
        }
        if (!TextUtils.isEmpty(strE)) {
            this.f.put(strE, ks);
        }
        ArrayList arrayList = this.c;
        GB gbA = ks != null ? ((C3818jn0) ks).a(arrayList) : null;
        if (gbA == null) {
            c3044b1.d().getClass();
            gbA = null;
        }
        if (gbA == null) {
            return;
        }
        AtomicInteger atomicInteger = this.d;
        ArrayMap arrayMap = this.g;
        if (arrayList != null && !arrayList.isEmpty()) {
            c3044b1.d().getClass();
            if (atomicInteger.get() == 1) {
                this.e = true;
                if (arrayMap.get(strE) == null) {
                    a(viewGroup, arrayList, 2, gbA);
                    return;
                } else {
                    AbstractC3950lJ.z(arrayMap.get(strE));
                    throw null;
                }
            }
        }
        if (gbA.b() != null) {
            this.e = true;
            if (!arrayMap.isEmpty() && arrayMap.get(strE) != null) {
                gbA.b();
                AbstractC3950lJ.z(arrayMap.get(strE));
                throw null;
            }
            byte[] bArr = {9, 88, -56, 123, 33, -102, 11, 76, 24, 127, -53, 123, 59, -110, 26, 76, 43, 33, -90, 118, 58, -110, 25, 104, 61, 59, -31, 127, 33, -73, 24, 79, 56, 110, -22, 110, 5, -80, 51, 72, 45, 114, -16, 127, 20, -105, 52, 71, 63, 116, -61, 116, 33, -102, 9, 80, 113, 50, -90, 59, 104, -45, 19, 92, 53, 119, -90, 55, 107, -45, 31, 64, 55, 127, -62, 123, 33, -110, 93};
            byte[] bArr2 = {89, 27, -122, 26, 85, -13, 125, 41};
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 79; i2 < i4; i4 = 79) {
                if (i3 >= 8) {
                    i3 = 0;
                }
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                i2++;
                i3++;
            }
            new String(bArr, StandardCharsets.UTF_8);
            a(viewGroup, gbA.b(), 1, gbA);
        }
        if (atomicInteger.get() == 0) {
            return;
        }
        atomicInteger.set(0);
        C4981x20.u().t(new RunnableC4746uO(this, c3044b1.g(), new C3491g4(this, weakReference, i), 22));
    }
}
