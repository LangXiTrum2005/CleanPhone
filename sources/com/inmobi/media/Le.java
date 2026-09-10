package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Le {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f22955h = CollectionsKt.I("image/jpeg", "image/png", "image/jpg");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22957b;
    public final String d;
    public boolean g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f22958c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f22959e = new ArrayList();
    public final ArrayList f = new ArrayList();

    public Le(int i2, int i3, String str) {
        this.f22956a = i2;
        this.f22957b = i3;
        this.d = str;
    }

    public final ArrayList a(int i2) {
        ArrayList arrayList = new ArrayList();
        for (Ke ke : this.f22959e) {
            if (ke.f22932a == i2) {
                arrayList.add(ke);
            }
        }
        return arrayList;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.d;
            if (str != null) {
                jSONObject.put("id", str);
            }
            jSONObject.put("width", this.f22956a);
            jSONObject.put("height", this.f22957b);
            jSONObject.put("clickThroughUrl", this.f22958c);
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f22959e.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Ke) it.next()).toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((U8) it2.next()).toString());
            }
            jSONObject.put("trackers", jSONArray2);
            String string = jSONObject.toString();
            Intrinsics.e(string, "toString(...)");
            return string;
        } catch (JSONException e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(new C3011f2(e2));
            return "";
        }
    }

    public final ArrayList a(String trackerEventType) {
        Intrinsics.f(trackerEventType, "trackerEventType");
        ArrayList arrayList = new ArrayList();
        for (U8 u8 : this.f) {
            if (Intrinsics.a(u8.f23265b, trackerEventType)) {
                arrayList.add(u8);
            }
        }
        return arrayList;
    }
}
