package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k6 extends k5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AppLovinAdLoadListener f8303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f8304h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends v7 {
        public a(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
            super(jSONObject, jSONObject2, lVar);
        }

        public void a(q8 q8Var) {
            if (q8Var == null) {
                throw new IllegalArgumentException("No aggregated vast response specified");
            }
            this.f9902b.add(q8Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b extends k6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final String f8305i;

        public b(String str, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            this.f8305i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            q8 q8VarB = b(this.f8305i);
            if (q8VarB != null) {
                a(q8VarB);
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Unable to process XML: " + this.f8305i);
            }
            c(this.f8305i);
            a(w7.XML_PARSING);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c extends k6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final JSONObject f8306i;

        public c(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            this.f8306i = v7Var.b();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Processing SDK JSON response...");
            }
            String string = JsonUtils.getString(this.f8306i, "xml", null);
            if (!StringUtils.isValidString(string)) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "No VAST response received.");
                }
                a(w7.NO_WRAPPER_RESPONSE);
            } else {
                if (string.length() >= ((Integer) this.f8297a.a(z4.U4)).intValue()) {
                    if (com.applovin.impl.sdk.p.a()) {
                        this.f8299c.b(this.f8298b, "VAST response is over max length");
                    }
                    a(w7.XML_PARSING);
                    return;
                }
                q8 q8VarB = b(string);
                if (q8VarB != null) {
                    a(q8VarB);
                    return;
                }
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.b(this.f8298b, "Unable to process XML: ".concat(string));
                }
                c(string);
                a(w7.XML_PARSING);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class d extends k6 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final q8 f8307i;

        public d(q8 q8Var, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
            super(v7Var, appLovinAdLoadListener, lVar);
            if (q8Var == null) {
                throw new IllegalArgumentException("No response specified.");
            }
            if (v7Var == null) {
                throw new IllegalArgumentException("No context specified.");
            }
            if (appLovinAdLoadListener == null) {
                throw new IllegalArgumentException("No callback specified.");
            }
            this.f8307i = q8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Processing VAST Wrapper response...");
            }
            a(this.f8307i);
        }
    }

    public k6(v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessVastResponse", lVar);
        if (v7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        this.f8303g = appLovinAdLoadListener;
        this.f8304h = (a) v7Var;
    }

    public static k6 a(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new c(new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    public q8 b(String str) {
        try {
            return r8.a(str, this.f8297a);
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "Failed to process VAST response", th2);
            }
            a(w7.XML_PARSING);
            this.f8297a.E().a(this.f8298b, th2);
            return null;
        }
    }

    public void c(String str) {
        if (str == null) {
            return;
        }
        Iterator<String> it = StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f8297a.a(z4.f10211n5)), 1).iterator();
        while (it.hasNext()) {
            q8 q8VarB = b("<VAST>" + it.next() + "</VAST>");
            if (q8VarB != null) {
                this.f8304h.a(q8VarB);
            }
        }
    }

    public static k6 a(String str, JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new b(str, new a(jSONObject, jSONObject2, lVar), appLovinAdLoadListener, lVar);
    }

    public static k6 a(q8 q8Var, v7 v7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        return new d(q8Var, v7Var, appLovinAdLoadListener, lVar);
    }

    public void a(q8 q8Var) {
        int iD = this.f8304h.d();
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.a(this.f8298b, "Finished parsing XML at depth " + iD);
        }
        this.f8304h.a(q8Var);
        if (d8.b(q8Var)) {
            int iIntValue = ((Integer) this.f8297a.a(z4.V4)).intValue();
            if (iD < iIntValue) {
                if (com.applovin.impl.sdk.p.a()) {
                    this.f8299c.a(this.f8298b, "VAST response is wrapper. Resolving...");
                }
                this.f8297a.s0().a(new s6(this.f8304h, this.f8303g, this.f8297a));
                return;
            }
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.b(this.f8298b, "Reached beyond max wrapper depth of " + iIntValue);
            }
            a(w7.WRAPPER_LIMIT_REACHED);
            return;
        }
        if (d8.a(q8Var)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.f8299c.a(this.f8298b, "VAST response is inline. Rendering ad...");
            }
            this.f8297a.s0().a(new n6(this.f8304h, this.f8303g, this.f8297a));
            return;
        }
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "VAST response is an error");
        }
        a(w7.NO_WRAPPER_RESPONSE);
    }

    public void a(w7 w7Var) {
        if (com.applovin.impl.sdk.p.a()) {
            this.f8299c.b(this.f8298b, "Failed to process VAST response due to VAST error code " + w7Var);
        }
        d8.a(this.f8304h, this.f8303g, w7Var, -6, this.f8297a);
    }
}
