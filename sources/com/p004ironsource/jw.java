package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class jw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NetworkSettings f25467b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<String> f25466a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f25468c = null;
    private boolean d = true;

    public static jw a() {
        return new jw();
    }

    public JSONObject b() {
        return this.f25468c;
    }

    public NetworkSettings c() {
        return this.f25467b;
    }

    public ArrayList<String> d() {
        return this.f25466a;
    }

    public boolean e() {
        return this.d;
    }

    public void a(NetworkSettings networkSettings) {
        this.f25467b = networkSettings;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f25466a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.f25468c = jSONObject;
    }

    public void a(boolean z2) {
        this.d = z2;
    }
}
