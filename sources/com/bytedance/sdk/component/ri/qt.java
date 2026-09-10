package com.bytedance.sdk.component.ri;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public interface qt {
    <T> T ri(String str, Type type);

    <T> String ri(T t);
}
