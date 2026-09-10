package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface LazyStringList extends ProtocolStringList {
    ByteString getByteString(int i2);

    List getUnderlyingElements();

    UnmodifiableLazyStringList getUnmodifiableView();

    void j(ByteString byteString);
}
