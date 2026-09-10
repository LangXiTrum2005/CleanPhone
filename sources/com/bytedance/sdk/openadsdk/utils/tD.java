package com.bytedance.sdk.openadsdk.utils;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class tD {
    public static void Lxb(com.bytedance.sdk.component.QAg.ZU zu, String str) {
        HashMap map = new HashMap();
        map.put(HttpRequestHeader.Referer, TTAdConstant.REQUEST_HEAD_REFERER);
        zu.Lxb(str, map);
    }
}
