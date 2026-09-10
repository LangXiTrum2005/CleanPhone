package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class bch implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene qdl;

    public bch(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.qdl = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i2) {
        uw.qdl(1, this.qdl, i2);
        return com.bytedance.sdk.component.utils.qdl.qdl(jSONObject);
    }
}
