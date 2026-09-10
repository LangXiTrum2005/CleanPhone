package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.pg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0522pg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NetworkSettings f30026b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f30025a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f30027c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30028d = true;

    public void a(NetworkSettings networkSettings) {
        this.f30026b = networkSettings;
    }

    public JSONObject b() {
        return this.f30027c;
    }

    public NetworkSettings c() {
        return this.f30026b;
    }

    public ArrayList<String> d() {
        return this.f30025a;
    }

    public boolean e() {
        return this.f30028d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f30025a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f30027c = jSONObject;
    }

    public void a(boolean z10) {
        this.f30028d = z10;
    }

    public static C0522pg a() {
        return new C0522pg();
    }
}
