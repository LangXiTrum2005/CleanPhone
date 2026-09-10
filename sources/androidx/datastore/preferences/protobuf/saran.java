package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: MessageLite.java */
/* JADX INFO: loaded from: classes.dex */
public interface saran extends privatdozent {

    /* JADX INFO: compiled from: MessageLite.java */
    public interface attabal extends privatdozent, Cloneable {
        saran build();

        saran buildPartial();

        attabal kattegat(impromptu impromptuVar, triweekly triweeklyVar) throws IOException;

        attabal saneness(saran saranVar);
    }

    void attabal(CodedOutputStream codedOutputStream) throws IOException;

    splinterproof<? extends saran> getParserForType();

    int getSerializedSize();

    attabal newBuilderForType();

    attabal toBuilder();

    ByteString toByteString();
}
