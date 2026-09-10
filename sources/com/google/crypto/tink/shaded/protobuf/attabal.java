package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.attabal;
import com.google.crypto.tink.shaded.protobuf.attabal.AbstractC0320attabal;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: AbstractMessageLite.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class attabal<MessageType extends attabal<MessageType, BuilderType>, BuilderType extends AbstractC0320attabal<MessageType, BuilderType>> implements privatdozent {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractMessageLite.java */
    public static abstract class AbstractC0320attabal<MessageType extends attabal<MessageType, BuilderType>, BuilderType extends AbstractC0320attabal<MessageType, BuilderType>> implements privatdozent.attabal {
        public static UninitializedMessageException marial(privatdozent privatdozentVar) {
            return new UninitializedMessageException(privatdozentVar);
        }

        public abstract BuilderType dern(MessageType messagetype);

        @Override // com.google.crypto.tink.shaded.protobuf.privatdozent.attabal
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public BuilderType lerp(privatdozent privatdozentVar) {
            if (getDefaultInstanceForType().getClass().isInstance(privatdozentVar)) {
                return (BuilderType) dern((attabal) privatdozentVar);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public void beachfront(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] competently() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamMilliradian = CodedOutputStream.milliradian(bArr);
            attabal(codedOutputStreamMilliradian);
            codedOutputStreamMilliradian.wireman();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(wireman("byte array"), e);
        }
    }

    public int dern(premeiotic premeioticVar) {
        int iSaneness = saneness();
        if (iSaneness != -1) {
            return iSaneness;
        }
        int serializedSize = premeioticVar.getSerializedSize(this);
        beachfront(serializedSize);
        return serializedSize;
    }

    public void impromptu(OutputStream outputStream) throws IOException {
        CodedOutputStream codedOutputStreamTimberyard = CodedOutputStream.timberyard(outputStream, CodedOutputStream.kattegat(getSerializedSize()));
        attabal(codedOutputStreamTimberyard);
        codedOutputStreamTimberyard.permissivist();
    }

    public UninitializedMessageException marial() {
        return new UninitializedMessageException(this);
    }

    public int saneness() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.privatdozent
    public ByteString toByteString() {
        try {
            ByteString.competently competentlyVarNewCodedBuilder = ByteString.newCodedBuilder(getSerializedSize());
            attabal(competentlyVarNewCodedBuilder.saneness());
            return competentlyVarNewCodedBuilder.attabal();
        } catch (IOException e) {
            throw new RuntimeException(wireman("ByteString"), e);
        }
    }

    public final String wireman(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }
}
