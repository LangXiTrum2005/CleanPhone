package com.bytedance.sdk.component.Lxb;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface sLN {
    <T> T Lxb(String str, Type type);

    <T> String Lxb(T t);
}
