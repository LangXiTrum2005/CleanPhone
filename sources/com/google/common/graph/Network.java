package com.google.common.graph;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@DoNotMock
@ElementTypesAreNonnullByDefault
public interface Network<N, E> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    Set a();

    boolean b();

    boolean c();

    Set d();

    boolean f();

    EndpointPair j(Object obj);
}
