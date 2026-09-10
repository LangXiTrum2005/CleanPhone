package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.component.embedapplog.IDefaultEncrypt;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Sfi implements IDefaultEncrypt {
    private final PangleEncryptConstant.CryptDataScene Lxb;

    public Sfi(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        this.Lxb = cryptDataScene;
    }

    @Override // com.bytedance.sdk.component.embedapplog.IDefaultEncrypt
    public JSONObject encrypt(JSONObject jSONObject, int i) {
        HD.Lxb(1, this.Lxb, i);
        return com.bytedance.sdk.component.utils.Lxb.Lxb(jSONObject);
    }
}
