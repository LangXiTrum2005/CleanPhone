package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class x7 implements s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f10000a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10001b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f10002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f10003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10005f;

    public static x7 a(q8 q8Var, com.applovin.impl.sdk.l lVar) {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        q8 q8VarC = q8Var.c("StaticResource");
        if (q8VarC == null || !URLUtil.isValidUrl(q8VarC.d())) {
            lVar.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return null;
            }
            lVar.Q().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        x7 x7Var = new x7();
        x7Var.f10002c = Uri.parse(q8VarC.d());
        q8 q8VarB = q8Var.b("IconClickThrough");
        if (q8VarB != null && URLUtil.isValidUrl(q8VarB.d())) {
            x7Var.f10003d = Uri.parse(q8VarB.d());
        }
        String str = (String) q8Var.a().get("width");
        int i10 = 0;
        int i11 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) q8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i10 = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) lVar.a(z4.f10111b5)).intValue();
        if (i11 <= 0 || i10 <= 0) {
            x7Var.f10005f = iIntValue;
            x7Var.f10004e = iIntValue;
            return x7Var;
        }
        double d10 = i11 / i10;
        int iMin = Math.min(Math.max(i11, i10), iIntValue);
        if (i11 >= i10) {
            x7Var.f10004e = iMin;
            x7Var.f10005f = (int) (((double) iMin) / d10);
            return x7Var;
        }
        x7Var.f10005f = iMin;
        x7Var.f10004e = (int) (((double) iMin) * d10);
        return x7Var;
    }

    public Set b() {
        return this.f10000a;
    }

    public Uri c() {
        return this.f10003d;
    }

    public int d() {
        return this.f10005f;
    }

    public Uri e() {
        return this.f10002c;
    }

    public Set f() {
        return this.f10001b;
    }

    public int g() {
        return this.f10004e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.l lVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, lVar);
        return imageView;
    }

    public static x7 a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        b8 b8VarA;
        b8 b8VarA2;
        if (jSONObject == null) {
            return null;
        }
        x7 x7Var = new x7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        x7Var.f10002c = Uri.parse(string);
        JSONArray jSONArrayX = defpackage.e.x("click_trackers", jSONObject);
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null);
            if (jSONObject2 != null && (b8VarA2 = b8.a(jSONObject2, lVar)) != null) {
                x7Var.f10000a.add(b8VarA2);
            }
        }
        JSONArray jSONArrayX2 = defpackage.e.x("view_trackers", jSONObject);
        for (int i11 = 0; i11 < jSONArrayX2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayX2, i11, (JSONObject) null);
            if (jSONObject3 != null && (b8VarA = b8.a(jSONObject3, lVar)) != null) {
                x7Var.f10001b.add(b8VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        x7Var.f10003d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        x7Var.f10004e = JsonUtils.getInt(jSONObject, "width", 0);
        x7Var.f10005f = JsonUtils.getInt(jSONObject, "height", 0);
        return x7Var;
    }

    @Override // com.applovin.impl.s4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f10000a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((b8) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f10001b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((b8) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f10002c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f10003d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f10004e);
        JsonUtils.putInt(jSONObject, "height", this.f10005f);
        return jSONObject;
    }
}
