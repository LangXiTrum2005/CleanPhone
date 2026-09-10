package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class fr implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene ri;

    public fr(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.ri = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        su.ri(1, this.ri, i);
        return com.bytedance.sdk.component.utils.ri.ri(jSONObject);
    }
}
