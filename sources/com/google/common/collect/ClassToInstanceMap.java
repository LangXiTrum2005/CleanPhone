package com.google.common.collect;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface ClassToInstanceMap<B> extends Map<Class<? extends B>, B> {
}
