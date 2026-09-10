package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface tc {

    public static final class a {
        public static /* synthetic */ Object a(tc tcVar, String str, Map map, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i2 & 2) != 0) {
                map = EmptyMap.X;
            }
            return tcVar.a(str, map, continuation);
        }
    }

    Object a(String str, String str2, Map map, String str3, Continuation continuation);

    Object a(String str, Map map, Continuation continuation);
}
