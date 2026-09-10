package com.unity3d.services.core.configuration;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class ExperimentObject {
    private static final String APPLIED_KEY = "applied";
    private static final String VALUE_KEY = "value";
    private final JSONObject _experimentData;

    public ExperimentObject(JSONObject jSONObject) {
        this._experimentData = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public ExperimentAppliedRule getAppliedRule() {
        ExperimentAppliedRule experimentAppliedRule = ExperimentAppliedRule.NEXT;
        String strOptString = this._experimentData.optString(APPLIED_KEY);
        if (!strOptString.isEmpty()) {
            try {
                return ExperimentAppliedRule.valueOf(strOptString.toUpperCase());
            } catch (IllegalArgumentException unused) {
            }
        }
        return experimentAppliedRule;
    }

    public boolean getBooleanValue() {
        return this._experimentData.optBoolean("value");
    }

    public String getStringValue() {
        return this._experimentData.optString("value");
    }
}
