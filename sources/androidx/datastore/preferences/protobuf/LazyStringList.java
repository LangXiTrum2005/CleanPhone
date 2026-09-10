package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface LazyStringList extends ProtocolStringList {
    Object getRaw(int i2);

    List getUnderlyingElements();

    void j0(ByteString byteString);
}
