package com.facebook.internal;

/* JADX INFO: loaded from: classes3.dex */
public class CollectionMapper {

    /* JADX INFO: renamed from: com.facebook.internal.CollectionMapper$1, reason: invalid class name */
    final class AnonymousClass1 implements OnMapperCompleteListener {
    }

    /* JADX INFO: renamed from: com.facebook.internal.CollectionMapper$2, reason: invalid class name */
    final class AnonymousClass2 implements OnMapValueCompleteListener {
    }

    public interface Collection<T> {
    }

    public interface OnErrorListener {
    }

    public interface OnMapValueCompleteListener extends OnErrorListener {
    }

    public interface OnMapperCompleteListener extends OnErrorListener {
    }

    public interface ValueMapper {
    }
}
