package com.thinkup.core.basead.adx.api;

import android.text.TextUtils;
import com.thinkup.core.oo.m0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class TUAdxAdapterConfig {
    public static final int RULE_TYPE_GROUP = 1;
    public static final int RULE_TYPE_NORMAL = 2;
    boolean isDefault;
    m0 mAdapterStrategy;
    JSONObject mOriginJSONObject;

    private TUAdxAdapterConfig(m0 m0Var, JSONObject jSONObject) {
        this.mAdapterStrategy = m0Var;
        this.mOriginJSONObject = jSONObject;
    }

    public static TUAdxAdapterConfig parse(JSONObject jSONObject) {
        m0 m0VarO = m0.o(jSONObject);
        return m0VarO != null ? new TUAdxAdapterConfig(m0VarO, jSONObject) : new TUAdxAdapterConfig(true);
    }

    public int getCoolingTimes() {
        m0.o oVarM;
        m0 m0Var = this.mAdapterStrategy;
        if (m0Var == null || (oVarM = m0Var.m()) == null) {
            return 5;
        }
        return oVarM.f42453n;
    }

    public int getGroupCount() {
        m0.o oVarM;
        m0 m0Var = this.mAdapterStrategy;
        if (m0Var == null || (oVarM = m0Var.m()) == null) {
            return 3;
        }
        return oVarM.o;
    }

    public JSONObject getOriginJSONObject() {
        return this.mOriginJSONObject;
    }

    public int getRuleType() {
        m0 m0Var = this.mAdapterStrategy;
        if (m0Var != null) {
            return m0Var.o();
        }
        return 1;
    }

    public int getValuedTimes() {
        m0.o oVarM;
        m0 m0Var = this.mAdapterStrategy;
        if (m0Var == null || (oVarM = m0Var.m()) == null) {
            return 3;
        }
        return oVarM.m;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isExpired() {
        m0 m0Var = this.mAdapterStrategy;
        if (m0Var != null) {
            return m0Var.n();
        }
        return true;
    }

    public String toString() {
        return "TUAdxAdapterConfig{isDefault=" + isDefault() + ", isExpired=" + isExpired() + ", getRuleType=" + getRuleType() + ", getGroupCount=" + getGroupCount() + ", getValuedTimes=" + getValuedTimes() + ", getCoolingTimes=" + getCoolingTimes() + ", getOriginJSONObject=" + this.mOriginJSONObject + AbstractJsonLexerKt.END_OBJ;
    }

    private TUAdxAdapterConfig(boolean z2) {
        this.isDefault = z2;
    }

    public static TUAdxAdapterConfig parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return parse(new JSONObject(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
