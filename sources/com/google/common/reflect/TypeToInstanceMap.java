package com.google.common.reflect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B> {
}
