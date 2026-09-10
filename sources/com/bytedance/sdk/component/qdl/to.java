package com.bytedance.sdk.component.qdl;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public interface to {
    <T> T qdl(String str, Type type);

    <T> String qdl(T t);
}
