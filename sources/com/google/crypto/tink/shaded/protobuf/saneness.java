package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.privatdozent;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class saneness<MessageType extends privatdozent> implements overspeculate<MessageType> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final kowloon f22279attabal = kowloon.saneness();

    public MessageType beachfront(ByteString byteString, kowloon kowloonVar) throws InvalidProtocolBufferException {
        taiyuan taiyuanVarNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeAttabal = attabal(taiyuanVarNewCodedInput, kowloonVar);
        try {
            taiyuanVarNewCodedInput.attabal(0);
            return messagetypeAttabal;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeAttabal);
        }
    }

    public final MessageType dern(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw wireman(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.overspeculate
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public MessageType saneness(ByteString byteString, kowloon kowloonVar) throws InvalidProtocolBufferException {
        return (MessageType) dern(beachfront(byteString, kowloonVar));
    }

    public final UninitializedMessageException wireman(MessageType messagetype) {
        return messagetype instanceof attabal ? ((attabal) messagetype).marial() : new UninitializedMessageException(messagetype);
    }
}
