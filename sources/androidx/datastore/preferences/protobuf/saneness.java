package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.saran;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class saneness<MessageType extends saran> implements splinterproof<MessageType> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final triweekly f9817attabal = triweekly.saneness();

    public MessageType beachfront(ByteString byteString, triweekly triweeklyVar) throws InvalidProtocolBufferException {
        impromptu impromptuVarNewCodedInput = byteString.newCodedInput();
        MessageType messagetypeSaneness = saneness(impromptuVarNewCodedInput, triweeklyVar);
        try {
            impromptuVarNewCodedInput.attabal(0);
            return messagetypeSaneness;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeSaneness);
        }
    }

    public final MessageType dern(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw wireman(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.splinterproof
    /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
    public MessageType attabal(ByteString byteString, triweekly triweeklyVar) throws InvalidProtocolBufferException {
        return (MessageType) dern(beachfront(byteString, triweeklyVar));
    }

    public final UninitializedMessageException wireman(MessageType messagetype) {
        return messagetype instanceof attabal ? ((attabal) messagetype).competently() : new UninitializedMessageException(messagetype);
    }
}
