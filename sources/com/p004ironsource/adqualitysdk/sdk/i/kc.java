package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class kc {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2850 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2851 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2849 = {49311, 51258, 53730, 55983, 57968, 60173, 62676, 64925, 34118, 33948, 35863, 38355, 40578, 42587, 44885, 45255, 47516, 49493, 51756, 54245, 58540, 60541, 62780, 65279, 1978, 3897, 4303, 6546, 8514, 10759, 34682, 36806, 38402, 40264, 42448, 44170, 45897, 47646, 49879, 51625, 53368, 59173, 61408, 63217, 'x', 'y', 32518, 40222, 42795, 44960, 46692, 48437, 34284, 36066, 37733, 39480, 58091, 59795, 61506, 50963, 53200, 54917, 56582, 9222, 11471, 13153, 14882, 718, 2481, 4215, 26405, 28642, 30446, 32088, 17413, 19669, 21392};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2848 = 6625329886171302076L;

    public interface b<T> {
        /* JADX INFO: renamed from: ｋ */
        T mo535(JSONArray jSONArray, int i2);
    }

    public interface c<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo534(JSONObject jSONObject, String str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static JSONObject m2756(JSONObject jSONObject, boolean z2) {
        int i2 = f2850 + 61;
        f2851 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!(!z2)) {
                    f2851 = (f2850 + 9) % 128;
                    jSONObject2.remove(ik.f2465);
                }
                f2850 = (f2851 + 99) % 128;
                return jSONObject2;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m2761(JSONArray jSONArray) {
        if (jSONArray == null) {
            f2850 = (f2851 + 121) % 128;
            return null;
        }
        List<String> listM2769 = m2769(jSONArray);
        f2850 = (f2851 + 83) % 128;
        return listM2769;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static JSONObject m2767(JSONObject jSONObject) {
        f2850 = (f2851 + 57) % 128;
        JSONObject jSONObjectM2756 = m2756(jSONObject, false);
        int i2 = f2851 + 27;
        f2850 = i2 % 128;
        if (i2 % 2 == 0) {
            return jSONObjectM2756;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2771(JSONObject jSONObject, JSONObject jSONObject2, boolean z2) {
        if (jSONObject != null && jSONObject2 != null) {
            f2851 = (f2850 + 39) % 128;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    jSONObject.put(next, jSONObject2.opt(next));
                } catch (JSONException unused) {
                }
            }
            if (z2) {
                int i2 = f2851 + 109;
                f2850 = i2 % 128;
                if (i2 % 2 != 0) {
                    jSONObject.remove(ik.f2465);
                    throw null;
                }
                jSONObject.remove(ik.f2465);
            }
        }
        f2850 = (f2851 + 75) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: JSONException -> 0x003e, TryCatch #0 {JSONException -> 0x003e, blocks: (B:4:0x000e, B:7:0x0015, B:11:0x0027, B:14:0x0035, B:20:0x0043, B:19:0x0040, B:21:0x0046, B:24:0x004b), top: B:28:0x000c }] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2773(JSONObject jSONObject, int i2, List<String> list) {
        int i3 = f2850 + 69;
        f2851 = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                jSONObject.names();
                throw null;
            }
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                for (int i4 = 0; i4 < jSONArrayNames.length(); i4++) {
                    int i5 = f2851 + 17;
                    f2850 = i5 % 128;
                    if (i5 % 2 != 0) {
                        jSONArrayNames.optString(i4);
                        throw null;
                    }
                    String strOptString = jSONArrayNames.optString(i4);
                    if (list != null) {
                        f2850 = (f2851 + 25) % 128;
                        if (!list.contains(strOptString)) {
                            m2763(jSONObject, strOptString, i2);
                        }
                    } else {
                        m2763(jSONObject, strOptString, i2);
                    }
                }
            }
        } catch (JSONException e2) {
            n.m2832(m2760(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10, ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (ExpandableListView.getPackedPositionChild(0L) + 49366)).intern(), m2760((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 20, 9 - View.resolveSize(0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 34009)).intern(), e2);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<String> m2762(JSONObject jSONObject, String str, List<String> list) {
        f2851 = (f2850 + 105) % 128;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return m2761(jSONArrayOptJSONArray);
        }
        int i2 = f2851 + 61;
        f2850 = i2 % 128;
        if (i2 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038 A[PHI: r3
  0x0038: PHI (r3v5 T) = (r3v4 T), (r3v6 T) binds: [B:14:0x0036, B:11:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> List<T> m2764(JSONArray jSONArray, b<T> bVar) {
        T tMo535;
        int i2 = f2850 + 69;
        f2851 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            int i4 = f2850 + 1;
            f2851 = i4 % 128;
            if (i4 % 2 == 0) {
                tMo535 = bVar.mo535(jSONArray, i3);
                int i5 = 77 / 0;
                if (tMo535 != null) {
                    arrayList.add(tMo535);
                }
            } else {
                tMo535 = bVar.mo535(jSONArray, i3);
                if (tMo535 != null) {
                    arrayList.add(tMo535);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2763(JSONObject jSONObject, String str, int i2) throws JSONException {
        f2851 = (f2850 + 121) % 128;
        String strM2768 = m2768(jSONObject.opt(str), i2);
        if (strM2768 != null) {
            if (strM2768.equals("")) {
                f2850 = (f2851 + 39) % 128;
                strM2768 = null;
            }
            jSONObject.put(str, strM2768);
        }
        int i3 = f2850 + 41;
        f2851 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 98 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <T> List<T> m2769(JSONArray jSONArray) {
        List<T> listM2764 = m2764(jSONArray, new b<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.kc.4
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.b
            /* JADX INFO: renamed from: ｋ */
            public final T mo535(JSONArray jSONArray2, int i2) {
                return (T) jSONArray2.opt(i2);
            }
        });
        int i2 = f2850 + 39;
        f2851 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return listM2764;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2759(JSONObject jSONObject, JSONObject jSONObject2) {
        f2850 = (f2851 + 33) % 128;
        m2771(jSONObject, jSONObject2, false);
        int i2 = f2851 + 41;
        f2850 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2770(JSONObject jSONObject, int i2) {
        int i3 = f2851 + 111;
        f2850 = i3 % 128;
        int i4 = i3 % 2;
        m2773(jSONObject, i2, null);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f2850 + 15;
        f2851 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2757(JSONArray jSONArray, int i2) throws JSONException {
        f2850 = (f2851 + 31) % 128;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            f2851 = (f2850 + 47) % 128;
            m2758(jSONArray, i3, i2);
        }
        int i4 = f2850 + 19;
        f2851 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:20:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2768(Object obj, int i2) throws JSONException {
        int i3;
        String str;
        int i4 = f2851 + 45;
        int i5 = i4 % 128;
        f2850 = i5;
        if (i4 % 2 != 0) {
            int i6 = 33 / 0;
            if (obj instanceof JSONObject) {
                m2770((JSONObject) obj, i2);
            } else if (obj instanceof JSONArray) {
                m2757((JSONArray) obj, i2);
            } else if (obj instanceof String) {
                i3 = i5 + 17;
                f2851 = i3 % 128;
                if (i3 % 2 == 0) {
                    str = (String) obj;
                    int i7 = 36 / 0;
                    if (str.length() <= i2) {
                        return str;
                    }
                } else {
                    str = (String) obj;
                    if (str.length() <= i2) {
                        return str;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, i2));
                return a.C(sb, m2760(((byte) KeyEvent.getModifierMetaStateMask()) + 15, TextUtils.getOffsetAfter("", 0) + 30, (char) (34645 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
            }
        } else if (obj instanceof JSONObject) {
            m2770((JSONObject) obj, i2);
        } else if (obj instanceof JSONArray) {
            m2757((JSONArray) obj, i2);
        } else if (obj instanceof String) {
            i3 = i5 + 17;
            f2851 = i3 % 128;
            if (i3 % 2 == 0) {
                str = (String) obj;
                int i8 = 36 / 0;
                if (str.length() <= i2) {
                    return str;
                }
            } else {
                str = (String) obj;
                if (str.length() <= i2) {
                    return str;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, i2));
            return a.C(sb2, m2760(((byte) KeyEvent.getModifierMetaStateMask()) + 15, TextUtils.getOffsetAfter("", 0) + 30, (char) (34645 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))));
        }
        f2851 = (f2850 + 91) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> Map<String, T> m2765(JSONObject jSONObject, c<T> cVar) {
        f2850 = (f2851 + 91) % 128;
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        f2851 = (f2850 + 39) % 128;
        while (!(!itKeys.hasNext())) {
            f2850 = (f2851 + 49) % 128;
            String next = itKeys.next();
            map.put(next, cVar.mo534(jSONObject, next));
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2758(JSONArray jSONArray, int i2, int i3) throws JSONException {
        String strM2768 = m2768(jSONArray.opt(i2), i3);
        if (strM2768 != null) {
            int i4 = f2850 + 93;
            f2851 = i4 % 128;
            int i5 = i4 % 2;
            jSONArray.put(i2, strM2768);
            if (i5 == 0) {
                throw null;
            }
            f2850 = (f2851 + 23) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2760(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f2849[i3 + i4]) ^ (((long) i4) * f2848)) ^ ((long) c2));
                        a.f69 = i4 + 1;
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

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Map<String, String> m2772(JSONObject jSONObject) {
        Map<String, String> mapM2765 = m2765(jSONObject, new c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.kc.1
            @Override // com.ironsource.adqualitysdk.sdk.i.kc.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo534(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i2 = f2851 + 19;
        f2850 = i2 % 128;
        if (i2 % 2 == 0) {
            return mapM2765;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static JSONObject m2766(int i2, int i3, long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j > -1) {
                f2851 = (f2850 + 63) % 128;
                jSONObject.put(m2760((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 44 - TextUtils.getCapsMode("", 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), i2);
                jSONObject.put(m2760(1 - TextUtils.indexOf("", ""), TextUtils.indexOf((CharSequence) "", '0') + 46, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern(), i3);
                jSONObject.put(m2760(Color.green(0) + 1, 46 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 32627)).intern(), j);
                jSONObject.put(m2760(1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47, (char) (40298 - MotionEvent.axisFromString(""))).intern(), j2);
                return jSONObject;
            }
            jSONObject.put(m2760((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, 44 - ExpandableListView.getPackedPositionType(0L), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), -1);
            jSONObject.put(m2760(1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 45, (char) Color.red(0)).intern(), -1);
            jSONObject.put(m2760(1 - (ViewConfiguration.getFadingEdgeLength() >> 16), 46 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.resolveSizeAndState(0, 0, 0) + 32626)).intern(), -1);
            jSONObject.put(m2760(1 - Color.red(0), 48 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (40299 - ExpandableListView.getPackedPositionType(0L))).intern(), -1);
            f2850 = (f2851 + 19) % 128;
            return jSONObject;
        } catch (JSONException e2) {
            n.m2832(m2760(ImageFormat.getBitsPerPixel(0) + 10, TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49366)).intern(), m2760(29 - TextUtils.getOffsetAfter("", 0), 48 - View.MeasureSpec.getSize(0), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42862)).intern(), e2);
            return jSONObject;
        }
    }
}
