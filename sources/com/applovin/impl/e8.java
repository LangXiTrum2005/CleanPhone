package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class e8 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f7802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f7803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f7805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f7806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x7 f7807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f7808g;

    private e8() {
        List list = Collections.EMPTY_LIST;
        this.f7802a = list;
        this.f7803b = list;
        this.f7806e = new HashSet();
        this.f7808g = new HashMap();
    }

    public static e8 a(q8 q8Var, e8 e8Var, v7 v7Var, com.applovin.impl.sdk.l lVar) {
        q8 q8VarC;
        x7 x7VarA;
        List listA;
        q8 q8VarC2;
        List listA2;
        q8 q8VarC3;
        int iA;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (v7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (e8Var == null) {
            try {
                e8Var = new e8(v7Var);
            } catch (Throwable th2) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("VastVideoCreative", "Error occurred while initializing", th2);
                }
                lVar.E().a("VastVideoCreative", th2);
                return null;
            }
        }
        if (e8Var.f7804c == 0 && (q8VarC3 = q8Var.c("Duration")) != null && (iA = a(q8VarC3.d(), lVar)) > 0) {
            e8Var.f7804c = iA;
        }
        q8 q8VarC4 = q8Var.c("MediaFiles");
        if (q8VarC4 != null && (listA2 = a(q8VarC4, lVar)) != null && listA2.size() > 0) {
            List list = e8Var.f7802a;
            if (list != null) {
                listA2.addAll(list);
            }
            e8Var.f7802a = listA2;
        }
        q8 q8VarC5 = q8Var.c("VideoClicks");
        if (q8VarC5 != null) {
            if (e8Var.f7805d == null && (q8VarC2 = q8VarC5.c("ClickThrough")) != null) {
                String strD = q8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    e8Var.f7805d = Uri.parse(strD);
                }
            }
            d8.a(q8VarC5.a("ClickTracking"), e8Var.f7806e, v7Var, lVar);
        }
        q8 q8VarC6 = q8Var.c("Icons");
        if (q8VarC6 != null && (x7VarA = x7.a((q8VarC = q8VarC6.c("Icon")), lVar)) != null) {
            q8 q8VarC7 = q8VarC.c("IconClicks");
            if (q8VarC7 != null && (listA = q8VarC7.a("IconClickTracking")) != null) {
                d8.a(listA, x7VarA.f10000a, v7Var, lVar);
            }
            List listA3 = q8VarC.a("IconViewTracking");
            if (listA3 != null) {
                d8.a(listA3, x7VarA.f10001b, v7Var, lVar);
            }
            e8Var.f7807f = x7VarA;
        }
        d8.a(q8Var, e8Var.f7808g, v7Var, lVar);
        return e8Var;
    }

    public Uri c() {
        return this.f7805d;
    }

    public int d() {
        return this.f7804c;
    }

    public Map e() {
        return this.f7808g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        if (this.f7804c != e8Var.f7804c) {
            return false;
        }
        List list = this.f7802a;
        if (list == null ? e8Var.f7802a != null : !list.equals(e8Var.f7802a)) {
            return false;
        }
        Uri uri = this.f7805d;
        if (uri == null ? e8Var.f7805d != null : !uri.equals(e8Var.f7805d)) {
            return false;
        }
        Set set = this.f7806e;
        if (set == null ? e8Var.f7806e != null : !set.equals(e8Var.f7806e)) {
            return false;
        }
        Map map = this.f7808g;
        if (map != null) {
            return map.equals(e8Var.f7808g);
        }
        return e8Var.f7808g == null;
    }

    public x7 f() {
        return this.f7807f;
    }

    public List g() {
        return this.f7802a;
    }

    public int hashCode() {
        List list = this.f7802a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f7804c) * 31;
        Uri uri = this.f7805d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f7806e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f7808g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f7802a + ", durationSeconds=" + this.f7804c + ", destinationUri=" + this.f7805d + ", clickTrackers=" + this.f7806e + ", eventTrackers=" + this.f7808g + ", industryIcon=" + this.f7807f + '}';
    }

    public Set b() {
        return this.f7806e;
    }

    private e8(v7 v7Var) {
        List list = Collections.EMPTY_LIST;
        this.f7802a = list;
        this.f7803b = list;
        this.f7806e = new HashSet();
        this.f7808g = new HashMap();
        this.f7803b = v7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.l lVar) {
        try {
            List<String> listExplode = CollectionUtils.explode(str, ":");
            if (listExplode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(listExplode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(listExplode.get(1))) + ((long) StringUtils.parseInt(listExplode.get(2))));
            }
        } catch (Throwable unused) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        List listA = q8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) lVar.a(z4.X4));
        List<String> listExplode2 = CollectionUtils.explode((String) lVar.a(z4.W4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            f8 f8VarA = f8.a((q8) it.next(), lVar);
            if (f8VarA != null) {
                try {
                    String strC = f8VarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(f8VarA);
                    } else {
                        if (((Boolean) lVar.a(z4.Y4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(f8VarA.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(f8VarA);
                            }
                        }
                        lVar.Q();
                        if (com.applovin.impl.sdk.p.a()) {
                            lVar.Q().k("VastVideoCreative", "Video file not supported: " + f8VarA);
                        }
                    }
                } catch (Throwable th2) {
                    lVar.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar.Q().a("VastVideoCreative", "Failed to validate video file: " + f8VarA, th2);
                    }
                }
            }
        }
        return arrayList;
    }

    public f8 a(long j10) {
        List list = this.f7802a;
        f8 f8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f7803b) {
            for (f8 f8Var2 : this.f7802a) {
                String strC = f8Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(f8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List<f8> list2 = arrayList;
        if (zIsEmpty) {
            list2 = this.f7802a;
        }
        Collections.sort(list2, new b2.j(1));
        for (f8 f8Var3 : list2) {
            if (f8Var3.b() > j10) {
                break;
            }
            f8Var = f8Var3;
        }
        return f8Var != null ? f8Var : (f8) list2.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(f8 f8Var, f8 f8Var2) {
        return Long.compare(f8Var.b(), f8Var2.b());
    }

    public static e8 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject == null) {
            return null;
        }
        e8 e8Var = new e8();
        JSONArray jSONArrayX = defpackage.e.x("video_files", jSONObject);
        e8Var.f7802a = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            f8 f8VarA = f8.a(JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null), lVar);
            if (f8VarA != null) {
                e8Var.f7802a.add(f8VarA);
            }
        }
        e8Var.f7803b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        e8Var.f7804c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        e8Var.f7805d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArrayX2 = defpackage.e.x("click_trackers", jSONObject);
        for (int i11 = 0; i11 < jSONArrayX2.length(); i11++) {
            b8 b8VarA = b8.a(JsonUtils.getJSONObject(jSONArrayX2, i11, (JSONObject) null), lVar);
            if (b8VarA != null) {
                e8Var.f7806e.add(b8VarA);
            }
        }
        e8Var.f7807f = x7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), lVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArrayX3 = defpackage.e.x(next, jSONObject2);
            for (int i12 = 0; i12 < jSONArrayX3.length(); i12++) {
                b8 b8VarA2 = b8.a(JsonUtils.getJSONObject(jSONArrayX3, i12, (JSONObject) null), lVar);
                if (b8VarA2 != null) {
                    hashSet.add(b8VarA2);
                }
            }
            e8Var.f7808g.put(next, hashSet);
        }
        return e8Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f7802a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((f8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f7803b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f7804c);
        Uri uri = this.f7805d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f7806e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((b8) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        x7 x7Var = this.f7807f;
        if (x7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", x7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f7808g.keySet()) {
            Set set = (Set) this.f7808g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((b8) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
