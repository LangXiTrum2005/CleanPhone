package com.thinkup.core.common.on;

import com.applovin.impl.Z;
import com.thinkup.core.api.TUAdRequest;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class nnn {
    private String m;
    private Map<String, String> m0;
    private String mm;
    private JSONObject mn;
    private JSONObject mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42215n;
    private TUAdRequest n0;
    private boolean nm;
    private boolean no;
    private String o;
    private String o0;
    private Map<String, Object> om;
    private Map<String, Object> on;
    private int oo;

    public nnn(String str, String str2, String str3, String str4, Map<String, Object> map, Map<String, Object> map2, JSONObject jSONObject, TUAdRequest tUAdRequest) {
        this.o = str;
        this.m = str2;
        this.f42215n = str3;
        this.o0 = str4;
        this.om = map;
        this.on = map2;
        this.mo = jSONObject;
        this.n0 = tUAdRequest;
    }

    private void o(String str) {
        this.o = str;
    }

    public final String m() {
        return this.o;
    }

    public final int m0() {
        return this.oo;
    }

    public final TUAdRequest mm() {
        return this.n0;
    }

    public final JSONObject mn() {
        return this.mo;
    }

    public final Map<String, String> mo() {
        return this.m0;
    }

    public final String n() {
        return this.m;
    }

    public final String n0() {
        return this.mm;
    }

    public final boolean nm() {
        return this.no;
    }

    public final boolean nn() {
        return this.nm;
    }

    public final JSONObject no() {
        return this.mn;
    }

    public final String o0() {
        return this.f42215n;
    }

    public final Map<String, Object> om() {
        return this.om;
    }

    public final Map<String, Object> on() {
        return this.on;
    }

    public final String oo() {
        return this.o0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PlaceStrategyLoaderParams{appId='");
        sb.append(this.o);
        sb.append("', appKey='");
        sb.append(this.m);
        sb.append("', placeId='");
        sb.append(this.f42215n);
        sb.append("', settingId='");
        sb.append(this.o0);
        sb.append("', fistReqPlaceStrategyFlag=");
        sb.append(this.oo);
        sb.append(", customMap=");
        sb.append(this.om);
        sb.append(", tkExtraMap=");
        sb.append(this.on);
        sb.append(", cachedMap=");
        return Z.o(sb, this.m0, AbstractJsonLexerKt.END_OBJ);
    }

    private void m(String str) {
        this.m = str;
    }

    private void n(String str) {
        this.f42215n = str;
    }

    private void o0(String str) {
        this.o0 = str;
    }

    public final void o(int i2) {
        this.oo = i2;
    }

    private void m(Map<String, Object> map) {
        this.om = map;
    }

    private void n(Map<String, Object> map) {
        this.on = map;
    }

    public final void o(Map<String, String> map) {
        this.m0 = map;
    }

    public final void m(boolean z2) {
        this.nm = z2;
    }

    public final void o(JSONObject jSONObject) {
        this.mn = jSONObject;
    }

    public final void o(boolean z2) {
        this.no = z2;
    }

    public nnn(String str, String str2, String str3, String str4) {
        this.mo = null;
        this.o = str;
        this.m = str2;
        this.f42215n = str3;
        this.mm = str4;
    }
}
