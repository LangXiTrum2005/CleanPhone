package p002kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import p002kotlin.reflect.jvm.internal.impl.protobuf.triweekly;

/* JADX INFO: compiled from: AbstractParser.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class saneness<MessageType extends triweekly> implements arytenoidectomy<MessageType> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final beachfront f31182attabal = beachfront.dern();

    public MessageType apical(InputStream inputStream, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        marial marialVarCompetently = marial.competently(inputStream);
        MessageType messagetypeDern = dern(marialVarCompetently, beachfrontVar);
        try {
            marialVarCompetently.attabal(0);
            return messagetypeDern;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeDern);
        }
    }

    public final UninitializedMessageException beachfront(MessageType messagetype) {
        return messagetype instanceof attabal ? ((attabal) messagetype).newUninitializedMessageException() : new UninitializedMessageException(messagetype);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public MessageType wireman(InputStream inputStream, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        return (MessageType) marial(cutely(inputStream, beachfrontVar));
    }

    public MessageType cutely(InputStream inputStream, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return (MessageType) apical(new attabal.AbstractC0693attabal.C0694attabal(inputStream, marial.stratoscope(i, inputStream)), beachfrontVar);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    public MessageType formularize(wireman wiremanVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        marial marialVarKowloon = wiremanVar.kowloon();
        MessageType messagetypeDern = dern(marialVarKowloon, beachfrontVar);
        try {
            marialVarKowloon.attabal(0);
            return messagetypeDern;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetypeDern);
        }
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public MessageType attabal(InputStream inputStream, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        return (MessageType) marial(apical(inputStream, beachfrontVar));
    }

    public final MessageType marial(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw beachfront(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.protobuf.arytenoidectomy
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public MessageType saneness(wireman wiremanVar, beachfront beachfrontVar) throws InvalidProtocolBufferException {
        return (MessageType) marial(formularize(wiremanVar, beachfrontVar));
    }
}
